package at.rodrigo.api.gateway.grafana.entity;

import lombok.Data;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
public class Timepicker {

    private Boolean now;
    private List<String> refreshIntervals = null;
    private List<String> timeOptions = null;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

}
