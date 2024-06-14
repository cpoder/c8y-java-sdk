package org.cpo.c8y;

import org.cpo.c8y.api.ManagedObjectsApi;
import org.cpo.c8y.model.ManagedObjectCollection;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class ExampleService {

    private final ManagedObjectsApi managedObjectsApi;

    @GetMapping("/test")
    public ResponseEntity<ManagedObjectCollection> getMethodName() {
        var col = managedObjectsApi.getManagedObjectCollectionResource(null);
        return ResponseEntity.ok().body(col);
    }

}
