package de.christianbergau;

import javax.enterprise.context.ApplicationScoped;

import io.smallrye.mutiny.Uni;

@ApplicationScoped
public class ReactiveGreetingService {
    public Uni<String> greeting(String name) {
        return Uni.createFrom().item(name)
        .onItem().transform(n -> String.format("Hello %s", n));
    }
}
