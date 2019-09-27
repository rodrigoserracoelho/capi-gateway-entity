package at.rodrigo.api.gateway.grafana.entity;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Dashboard {

    private Annotations annotations;
    private String description;
    private Boolean editable;
    private Integer gnetId;
    private Integer graphTooltip;
    private Integer id;
    private Long iteration;
    private List<Object> links = new ArrayList<Object>();
    private List<Panel> panels = new ArrayList<Panel>();
    private String refresh;
    private Integer schemaVersion;
    private String style;
    private List<Object> tags = new ArrayList<Object>();
    private Templating templating;
    private Time time;
    private Timepicker timepicker;
    private String timezone;
    private String title;
    private String uid;
    private Integer version;

}