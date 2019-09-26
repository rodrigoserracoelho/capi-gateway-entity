package at.rodrigo.api.gateway.grafana.entity;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class GridPos {

    private Integer h;
    private Integer w;
    private Integer x;
    private Integer y;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

}
