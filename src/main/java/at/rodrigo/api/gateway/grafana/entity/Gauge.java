package at.rodrigo.api.gateway.grafana.entity;

import lombok.Data;

@Data
public class Gauge {

    private Integer maxValue;
    private Integer minValue;
    private Boolean show;
    private Boolean thresholdLabels;
    private Boolean thresholdMarkers;

}