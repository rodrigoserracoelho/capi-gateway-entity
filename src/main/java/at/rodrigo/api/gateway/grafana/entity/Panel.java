package at.rodrigo.api.gateway.grafana.entity;

import lombok.Data;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
public class Panel {

    private Object cacheTimeout;
    private Boolean colorBackground;
    private Boolean colorValue;
    private List<String> colors = null;
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
    private List<Object> links = null;
    private Integer mappingType;
    private List<MappingType> mappingTypes = null;
    private Integer maxDataPoints;
    private String nullPointMode;
    private Object nullText;
    private Options options;
    private String postfix;
    private String postfixFontSize;
    private String prefix;
    private String prefixFontSize;
    private List<RangeMap> rangeMaps = null;
    private Sparkline sparkline;
    private String tableColumn;
    private List<Target> targets = null;
    private Object thresholds;
    private String title;
    private String type;
    private String valueFontSize;
    private List<ValueMap> valueMaps = null;
    private String valueName;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

}
