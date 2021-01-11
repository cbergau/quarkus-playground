package de.christianbergau;

import java.util.Set;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.jboss.resteasy.annotations.jaxrs.PathParam;

@Path("/country")
public class CountriesResource {

    @Inject
    @RestClient
    CountriesService countriesService;

    @GET
    @Path("/name/{name}")
    public Set<Country> name(@PathParam String name) {
        return countriesService.getByName(name);
    }
}