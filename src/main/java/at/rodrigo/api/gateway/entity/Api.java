package at.rodrigo.api.gateway.entity;

import lombok.Data;

import java.util.List;

@Data
public class Api {

    private String endpoint;
    private String name;
    private boolean secured;
    private String context;
    private String jwsEndpoint;
    private List<Path> paths;


}
