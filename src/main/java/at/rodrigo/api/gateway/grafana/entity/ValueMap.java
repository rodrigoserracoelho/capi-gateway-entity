package at.rodrigo.api.gateway.grafana.entity;

import lombok.Data;

@Data
public class ValueMap {

    private String op;
    private String text;
    private String value;

}