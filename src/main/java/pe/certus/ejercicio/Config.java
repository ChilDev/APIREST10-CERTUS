package pe.certus.ejercicio;

import jakarta.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component
@ApplicationPath("/api")
public class Config extends ResourceConfig {
    public Config(){
        packages("pe.certus.clases");
    }
}
