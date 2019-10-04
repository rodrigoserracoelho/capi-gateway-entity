package at.rodrigo.api.gateway.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Path implements Serializable {
    private Verb verb;
    private String path;
    private String routeID;
}
