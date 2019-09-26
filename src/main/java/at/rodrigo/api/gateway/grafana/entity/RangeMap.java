package at.rodrigo.api.gateway.grafana.entity;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class RangeMap {

    private String from;
    private String text;
    private String to;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

}
