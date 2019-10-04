package at.rodrigo.api.gateway.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.io.Serializable;
import java.util.List;

@Data
public class Api implements Serializable {

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
    private boolean blockIfInError;
    private int maxAllowedFailedCalls;
    private boolean unblockAfter;
    private int unblockAfterMinutes;

}
