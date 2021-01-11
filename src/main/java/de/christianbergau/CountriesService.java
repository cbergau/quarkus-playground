package de.christianbergau;

import java.util.Set;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import org.jboss.resteasy.annotations.jaxrs.PathParam;

@Path("/v2")
@RegisterRestClient(configKey="country-api")
public interface CountriesService {

    @GET
    @Path("/name/{name}")
    Set<Country> getByName(@PathParam String name);
}
