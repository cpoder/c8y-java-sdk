package org.cpo.c8y.microservice.notification;

import org.cpo.c8y.model.Operation;

public interface OperationProcessor {
    void process(Operation operation);
}
