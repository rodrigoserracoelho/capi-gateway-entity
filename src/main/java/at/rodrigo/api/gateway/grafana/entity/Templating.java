package at.rodrigo.api.gateway.grafana.entity;

import lombok.Data;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
public class Templating {

    private List<List_> list;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();


}
