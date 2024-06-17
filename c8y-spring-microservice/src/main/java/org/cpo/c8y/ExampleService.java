package org.cpo.c8y;

import org.cpo.c8y.api.ExternalIdsApi;
import org.cpo.c8y.api.ManagedObjectsApi;
import org.cpo.c8y.model.ManagedObjectCollection;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequiredArgsConstructor
@Slf4j
public class ExampleService {

    // @Autowired
    // @Qualifier("userManagedObjectsApi")
    private final ManagedObjectsApi managedObjectsApi;
    private final ExternalIdsApi externalIdsApi;

    private final MicroserviceSubscriptionsService microserviceSubscriptionsService;

    @GetMapping("/test")
    public ResponseEntity<ManagedObjectCollection> getMethodName() {
        var extId = externalIdsApi.getExternalIDResource("test type", "test id");
        log.info("External Id: {}", extId);
        var col = managedObjectsApi.getManagedObjectCollectionResource(null);
        return ResponseEntity.ok().body(col);
    }

    @GetMapping("/test2")
    public ResponseEntity<String> getMethodName2() {
        microserviceSubscriptionsService.runForEachTenant(() -> {
            log.info("Running in tenant {}", microserviceSubscriptionsService.getCurrentTenant());
            managedObjectsApi.getManagedObjectCollectionResource(null);
        });
        return ResponseEntity.ok().body("OK");
    }
}
