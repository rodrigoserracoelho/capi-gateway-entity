package at.rodrigo.api.gateway.grafana.entity;

import lombok.Data;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
public class List_ {

    private Object allValue;
    private Current current;
    private String datasource;
    private String definition;
    private Integer hide;
    private Boolean includeAll;
    private String label;
    private Boolean multi;
    private String name;
    private List<Object> options = null;
    private String query;
    private Integer refresh;
    private String regex;
    private Boolean skipUrlSync;
    private Integer sort;
    private String tagValuesQuery;
    private List<Object> tags = null;
    private String tagsQuery;
    private String type;
    private Boolean useTags;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
}
