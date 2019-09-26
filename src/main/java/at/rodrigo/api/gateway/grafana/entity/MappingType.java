package at.rodrigo.api.gateway.grafana.entity;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class MappingType {

    private String name;
    private Integer value;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
}