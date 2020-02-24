package at.rodrigo.api.gateway.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class RunningApi implements Serializable {
    private String id;
    private String context;
    private String path;
    private List<String> endpoints;
    private EndpointType endpointType;
    private Verb verb;
    private String jwsEndpoint;
    private List<String> audience;
    private String routeId;
    private String zipkinServiceName;
    private String prometheusMetricName;
    private int failedCalls;
    private int maxAllowedFailedCalls;
    private boolean unblockAfter;
    private int unblockAfterMinutes;
    private boolean disabled;
    private boolean removed;
    private int countBlockChecks;
    private boolean blockIfInError;
    private boolean secured;
    private SuspensionType suspensionType;
    private String suspensionMessage;
    private boolean zipkinTraceIdVisible;
    private boolean internalExceptionMessageVisible;
    private boolean internalExceptionVisible;
    private int connectTimeout;
    private int socketTimeout;
}
