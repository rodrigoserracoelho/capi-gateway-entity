package at.rodrigo.api.gateway.grafana.entity;

import lombok.Data;

@Data
public class Annotation {

    private Integer builtIn;
    private String datasource;
    private boolean enable;
    private boolean hide;
    private String iconColor;
    private Integer limit;
    private String name;
    private Integer showIn;
    private String type;

}
