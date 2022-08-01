import numberreceiver.NumberReceiverConfiguration;
import numberreceiver.ResultMessage;

import java.util.Set;

public class LottoRunner {
    public static void main(String[] args) {

        ResultMessage resultMessage = new NumberReceiverConfiguration()
                .numberReceiverFacade()
                .inputNumbers(Set.of(1,2,3,4,5,6));
        String hashReceived = resultMessage.getHash();
        System.out.println(resultMessage.getMessage() + ", hash: " + hashReceived);

    }
}
