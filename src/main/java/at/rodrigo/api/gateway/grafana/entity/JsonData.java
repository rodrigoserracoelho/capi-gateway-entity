package at.rodrigo.api.gateway.grafana.entity;

import lombok.Data;

@Data
public class JsonData {

    private String httpMethod;
    private String keepCookies;
}
