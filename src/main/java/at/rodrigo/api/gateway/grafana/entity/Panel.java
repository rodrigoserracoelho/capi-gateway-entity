package at.rodrigo.api.gateway.grafana.entity;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Panel {

    private Object cacheTimeout;
    private Boolean colorBackground;
    private Boolean colorValue;
    private List<String> colors = new ArrayList<String>();
    private String datasource;
    private Integer decimals;
    private Boolean editable;
    private Boolean error;
    private String format;
    private Gauge gauge;
    private GridPos gridPos;
    private String height;
    private Integer id;
    private Object interval;
    private List<Object> links = new ArrayList<Object>();
    private Integer mappingType;
    private List<MappingType> mappingTypes = new ArrayList<MappingType>();
    private Integer maxDataPoints;
    private String nullPointMode;
    private Object nullText;
    private Options options;
    private String postfix;
    private String postfixFontSize;
    private String prefix;
    private String prefixFontSize;
    private List<RangeMap> rangeMaps = new ArrayList<RangeMap>();
    private Sparkline sparkline;
    private String tableColumn;
    private List<Target> targets = new ArrayList<Target>();
    private Object thresholds;
    private String title;
    private String type;
    private String valueFontSize;
    private List<ValueMap> valueMaps = new ArrayList<ValueMap>();
    private String valueName;
    private boolean collapsed;
    private String repeat;
    private List<String> panels = new ArrayList<String>();

}
