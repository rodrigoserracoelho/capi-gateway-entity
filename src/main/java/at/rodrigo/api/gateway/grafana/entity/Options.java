package at.rodrigo.api.gateway.grafana.entity;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class Options {

    private Map<String, Object> additionalProperties = new HashMap<String, Object>();


}
