package at.rodrigo.api.gateway.grafana.entity;

import lombok.Data;

@Data
public class Sparkline {

    private String fillColor;
    private Boolean full;
    private String lineColor;
    private Boolean show;

}
