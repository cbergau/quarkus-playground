package de.christianbergau;

import javax.ws.rs.core.Application;

import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.*;

@OpenAPIDefinition(
    info = @Info(
        title="Example API",
        version = "1.0.1",
        contact = @Contact(
            name = "Christian Bergau",
            url = "http://exampleurl.com/contact",
            email = "cbergau86@gmail.com"),
        license = @License(
            name = "Apache 2.0",
            url = "http://www.apache.org/licenses/LICENSE-2.0.html"))
)
public class MainApplication extends Application {

}