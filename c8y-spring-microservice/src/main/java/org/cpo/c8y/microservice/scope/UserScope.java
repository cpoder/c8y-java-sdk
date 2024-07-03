package org.cpo.c8y.microservice.scope;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.Scope;
import org.springframework.lang.NonNull;

public class UserScope implements Scope {
    private Map<String, Object> scopedObjects = Collections.synchronizedMap(new HashMap<String, Object>());
    private Map<String, Runnable> destructionCallbacks = Collections.synchronizedMap(new HashMap<String, Runnable>());

    @Override
    public @NonNull Object get(@NonNull String name, @NonNull ObjectFactory<?> objectFactory) {
        var object = objectFactory.getObject();
        return scopedObjects.computeIfAbsent(name, key -> object);
    }

    @Override
    public String getConversationId() {
        return null;
    }

    @Override
    public void registerDestructionCallback(@NonNull String name, @NonNull Runnable callback) {
        destructionCallbacks.put(name, callback);
    }

    @Override
    public Object remove(@NonNull String name) {
        destructionCallbacks.remove(name);
        return scopedObjects.remove(name);
    }

    @Override
    public Object resolveContextualObject(@NonNull String arg0) {
        return null;
    }

}
