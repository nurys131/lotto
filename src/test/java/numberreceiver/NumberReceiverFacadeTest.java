package numberreceiver;

import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

class NumberReceiverFacadeTest {

    NumberReceiverFacade numberReceiverFacade = new NumberReceiverConfiguration().numberReceiverFacade();
    String SOME_HASH = "hash";

    @Test
    public void module_should_accept_when_user_gave_6_valid_numbers_in_range() {
        // given

        //when
        ResultMessage result = numberReceiverFacade.inputNumbers(Set.of(1,3,5,7,9,49));

        //then
        ResultMessage accepted = new ResultMessage("Accepted", SOME_HASH);
        assertThat(result).isEqualTo(accepted);
    }

    // not important
    @Test
    public void module_should_not_accept_when_user_gave_more_than_6_numbers() {
        // given

        //when
        ResultMessage result = numberReceiverFacade.inputNumbers(Set.of(1,3,5,7,9,49,40));

        //then
        ResultMessage notAccepted = new ResultMessage("Not accepted", SOME_HASH);
        assertThat(result).isEqualTo(notAccepted);
    }

    @Test
    public void module_should_not_accept_when_user_gave_number_out_of_range() {
        // given

        //when
        ResultMessage result = numberReceiverFacade.inputNumbers(Set.of(1,3,5,7,9,50));

        //then
        ResultMessage notAccepted = new ResultMessage("Not accepted", SOME_HASH);
        assertThat(result).isEqualTo(notAccepted);
    }

    @Test
    public void module_should_not_accept_when_user_gave_number_out_of_range2() {
        // given

        //when
        ResultMessage result = numberReceiverFacade.inputNumbers(Set.of(0,3,5,7,9,49));

        //then
        ResultMessage notAccepted = new ResultMessage("Not accepted", SOME_HASH);
        assertThat(result).isEqualTo(notAccepted);
    }

}