package at.rodrigo.api.gateway.grafana.entity;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Annotations {

    private List<Annotation> list = new ArrayList<Annotation>();

}