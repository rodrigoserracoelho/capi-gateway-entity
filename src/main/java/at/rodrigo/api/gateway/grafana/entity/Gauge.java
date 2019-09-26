package at.rodrigo.api.gateway.grafana.entity;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class Gauge {

    private Integer maxValue;
    private Integer minValue;
    private Boolean show;
    private Boolean thresholdLabels;
    private Boolean thresholdMarkers;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

}