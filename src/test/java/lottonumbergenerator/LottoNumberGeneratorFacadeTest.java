package lottonumbergenerator;

import numberreceiver.NumberReceiverConfiguration;
import numberreceiver.NumberReceiverFacade;
import numberreceiver.ResultMessage;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static configuration.GameConfiguration.AMOUNT_OF_NUMBERS;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class LottoNumberGeneratorFacadeTest {
    LottoNumberGeneratorFacade lottoNumberGeneratorFacade = new LottoNumberGeneratorConfiguration().lottoNumberGeneratorFacade();

    @Test
    public void module_should_have_size_like_AMOUNT_OF_NUMBERS() {
        // given
        var result = lottoNumberGeneratorFacade.winningNumbers();

        //when
        //then
        assertThat(result.size()).isEqualTo(AMOUNT_OF_NUMBERS);
    }
}