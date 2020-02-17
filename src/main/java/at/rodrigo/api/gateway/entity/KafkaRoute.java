package at.rodrigo.api.gateway.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.io.Serializable;

@Data
public class KafkaRoute implements Serializable {
    @Id
    private String id;
    private String brokerEndpoint;
    private String topicName;
    private String groupID;
    private String httpEndpoint;
    private String expectedHeaders;
    private boolean preserveKafkaHeaders;
}
