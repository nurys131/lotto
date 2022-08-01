package numberreceiver;

import lombok.Value;

//@Value - Override Equals and HashCode
@Value
public class ResultMessage {
    String message;
    String hash;
}
