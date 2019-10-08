package at.rodrigo.api.gateway.key.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;

import java.util.List;

@Data
public class Consumer {

    @Id
    private String clientId;
    @Transient
    private String clientSecret;
    private String clientName;
    @JsonIgnore
    private String clientSecretHash;
    private List<Subscription> subscriptionList;
}
