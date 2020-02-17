package at.rodrigo.api.gateway.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
public class ThrottlingPolicy implements Serializable {
    private int maxCallsAllowed;
    private int periodForMaxCalls;
    private int startCountingAt;
    private int totalCalls;
    private Date throttlingExpiration;
    private boolean applyPerPath;
    @JsonIgnore
    private List<String> routeID;
}
