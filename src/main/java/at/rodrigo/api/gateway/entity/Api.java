package at.rodrigo.api.gateway.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.List;

@Data
public class Api {

    @Id
    private String id;
    private String endpoint;
    private EndpointType endpointType;
    private String name;
    private boolean secured;
    private String context;
    private String jwsEndpoint;
    private List<Path> paths;
    private boolean swagger;
    private String swaggerEndpoint;
    private List<String> audience;


}
