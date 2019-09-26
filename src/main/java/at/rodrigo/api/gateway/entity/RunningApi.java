package at.rodrigo.api.gateway.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class RunningApi implements Serializable {

    private String id;
    private String routeId;
    private String zipkinServiceName;
    private String prometheusMetricName;
    private int failedCalls;
    private int maxAllowedFailedCalls;
    private boolean disabled;
    private boolean removed;
}
