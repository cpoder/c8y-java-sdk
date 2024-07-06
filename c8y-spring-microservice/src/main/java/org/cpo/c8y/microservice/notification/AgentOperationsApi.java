package org.cpo.c8y.microservice.notification;

import java.util.HashMap;
import java.util.Map;

import org.cometd.client.BayeuxClient;
import org.cometd.client.ext.AckExtension;
import org.cometd.client.websocket.jakarta.WebSocketTransport;
import org.cpo.c8y.RFC3339DateFormat;
import org.cpo.c8y.microservice.MicroserviceSubscriptionsService;
import org.cpo.c8y.model.Operation;
import org.openapitools.jackson.nullable.JsonNullableModule;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import jakarta.websocket.ContainerProvider;
import jakarta.websocket.WebSocketContainer;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
@RequiredArgsConstructor
public class AgentOperationsApi {
    private final MicroserviceSubscriptionsService microserviceSubscriptionsService;

    private final ObjectMapper objectMapper = new ObjectMapper()
            .enable(SerializationFeature.WRITE_ENUMS_USING_TO_STRING)
            .enable(DeserializationFeature.READ_ENUMS_USING_TO_STRING)
            .disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)
            .disable(DeserializationFeature.FAIL_ON_INVALID_SUBTYPE)
            .disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS).setDateFormat(new RFC3339DateFormat())
            .registerModule(new JavaTimeModule()).registerModule(new JsonNullableModule());

    public void subscribe(String agentId, String tenant, OperationProcessor processor) {
        BayeuxClient client = handshake();
        var session = client.getChannel("/" + agentId);
        if (session.subscribe((channel, message) -> {
            log.info("Channel {} received {}", channel.getId(), message);
            Operation op = getOperation(message.getData());
            microserviceSubscriptionsService.runForTenant(tenant, () -> processor.process(op));
        })) {
            log.info("Successfully subscribed to {}", agentId);
        } else {
            log.error("Failed to subscribe to {}", agentId);
        }
    }

    private Operation getOperation(Object data) {
        Operation result = null;
        try {
            String json = objectMapper.writeValueAsString(data);
            log.info("{}", json);
            result = objectMapper.readValue(json, Operation.class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return result;
    }

    private Map<String, Object> getOptions() {
        Map<String, Object> options = new HashMap<>();
        Map<String, Object> ext = new HashMap<>();
        Map<String, String> authn = new HashMap<>();
        authn.put("token", microserviceSubscriptionsService.getMicroserviceBase64Credentials());
        ext.put("com.cumulocity.authn", authn);
        options.put("ext", ext);
        return options;
    }

    private BayeuxClient handshake() {
        WebSocketContainer webSocketContainer = ContainerProvider.getWebSocketContainer();
        Map<String, Object> transportOptions = new HashMap<>();
        WebSocketTransport transport = new WebSocketTransport(transportOptions, null, webSocketContainer);
        String url = System.getenv("C8Y_BASEURL") + "/notification/operations";
        log.info("Will start a Bayeux session on {}", url);
        BayeuxClient client = new BayeuxClient(url, transport);
        client.addExtension(new AckExtension());
        client.handshake(getOptions());
        boolean handshaked = client.waitFor(1000, BayeuxClient.State.CONNECTED);
        if (handshaked) {
            log.info("Handshake was successful!");
        } else {
            log.error("Handshake failed: {}", client);
        }
        return client;
    }
}
