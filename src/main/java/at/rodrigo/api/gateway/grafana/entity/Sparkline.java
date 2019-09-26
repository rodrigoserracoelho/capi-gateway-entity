package at.rodrigo.api.gateway.grafana.entity;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class Sparkline {

    private String fillColor;
    private Boolean full;
    private String lineColor;
    private Boolean show;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

}
