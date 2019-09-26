package at.rodrigo.api.gateway.grafana.entity;

import lombok.Data;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
public class Dashboard {

    //private Annotations annotations;
    private String description;
    private Boolean editable;
    private Integer gnetId;
    private Integer graphTooltip;
    private Integer id;
    private Long iteration;
    private List<Object> links = null;
    private List<Panel> panels = null;
    private String refresh;
    private Integer schemaVersion;
    private String style;
    private List<Object> tags = null;
    private Templating templating;
    private Time time;
    private Timepicker timepicker;
    private String timezone;
    private String title;
    private String uid;
    private Integer version;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();



}