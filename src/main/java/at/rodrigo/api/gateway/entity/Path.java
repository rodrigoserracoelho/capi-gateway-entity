package at.rodrigo.api.gateway.entity;

import lombok.Data;

@Data
public class Path {
    private Verb verb;
    private String path;
}
