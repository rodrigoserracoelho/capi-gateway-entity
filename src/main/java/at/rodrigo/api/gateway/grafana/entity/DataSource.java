package at.rodrigo.api.gateway.grafana.entity;

import lombok.Data;

@Data
public class DataSource {

    private Long id;
    private Long orgId;
    private String name;
    private String type;
    private String typeLogoUrl;
    private String access;
    private String url;
    private String password;
    private String user;
    private String database;
    private String basicAuth;
    private String isDefault;
    private JsonData jsonData;
    private String readOnly;

}
