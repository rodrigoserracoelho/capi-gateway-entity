package at.rodrigo.api.gateway.grafana.entity;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class ValueMap {

    private String op;
    private String text;
    private String value;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

}