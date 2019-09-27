package at.rodrigo.api.gateway.grafana.entity;

import lombok.Data;

@Data
public class Target {

    private String expr;
    private String format;
    private Integer intervalFactor;
    private String legendFormat;
    private String metric;
    private String refId;
    private Integer step;

}