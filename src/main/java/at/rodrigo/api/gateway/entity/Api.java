package at.rodrigo.api.gateway.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.io.Serializable;
import java.util.List;

@Data
public class Api implements Serializable {
    @Id
    private String id;
    private List<String> endpoints;
    private EndpointType endpointType;
    private int connectTimeout;
    private int socketTimeout;
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
    private boolean zipkinTraceIdVisible;
    private boolean internalExceptionMessageVisible;
    private boolean internalExceptionVisible;
    private boolean returnAPIError;
    private boolean unblockAfter;
    private int unblockAfterMinutes;
    private ThrottlingPolicy throttlingPolicy;
}
