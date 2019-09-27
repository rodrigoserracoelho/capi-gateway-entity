package at.rodrigo.api.gateway.grafana.entity;

import lombok.Data;

@Data
public class GrafanaDashboard {

    private Meta meta;
    private Dashboard dashboard;
    private String message;
    private String status;



}