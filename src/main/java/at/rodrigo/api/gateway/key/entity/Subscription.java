package at.rodrigo.api.gateway.key.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.List;

@Data
public class Subscription {
    @Id
    private String subscriptionId;
    private List<String> routeList;
}
