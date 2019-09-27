package at.rodrigo.api.gateway.grafana.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Timepicker {

    private Boolean now;
    @JsonProperty("refresh_intervals")
    private List<String> refreshIntervals = new ArrayList<String>();
    @JsonProperty("time_options")
    private List<String> timeOptions = new ArrayList<String>();

}
