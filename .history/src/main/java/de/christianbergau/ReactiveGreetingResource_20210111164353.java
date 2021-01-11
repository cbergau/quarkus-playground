package de.christianbergau;

import javax.inject.Inject;
import javax.ws.rs.Path;

@Path("/hello")
public class ReactiveGreetingResource {
    
    @Inject
    ReactiveGreetingService service;
}
