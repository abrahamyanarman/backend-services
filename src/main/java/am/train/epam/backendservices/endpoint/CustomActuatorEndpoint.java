package am.train.epam.backendservices.endpoint;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id = "customInfo")
public class CustomActuatorEndpoint {

    @Value("${spring.profiles.active}")
    private String activeProfile;

    @Value("${spring.datasource.url}")
    private String databaseUrl;

    @ReadOperation
    public CustomInfo customInfo() {
        return new CustomInfo(activeProfile, databaseUrl);
    }

    private record CustomInfo(String activeProfile, String databaseUrl) {
    }
}