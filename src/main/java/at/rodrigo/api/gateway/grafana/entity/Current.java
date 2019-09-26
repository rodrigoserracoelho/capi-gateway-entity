package at.rodrigo.api.gateway.grafana.entity;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class Current {

    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

}