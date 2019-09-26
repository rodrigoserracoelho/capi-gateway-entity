package at.rodrigo.api.gateway.grafana.entity;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class GrafanaDashboard {

    private Meta meta;
    private Dashboard dashboard;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();



}