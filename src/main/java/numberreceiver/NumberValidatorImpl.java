package numberreceiver;

import java.util.Collections;
import java.util.Set;

import static configuration.GameConfiguration.*;

public class NumberValidatorImpl implements NumberValidator {

    @Override
    public boolean numberAreValid(Set<Integer> numbers) {
        return numbers.size() == AMOUNT_OF_NUMBERS && isNumberInRange(numbers);
    }

    private boolean isNumberInRange(Set<Integer> numbers) {
        Integer max = Collections.max(numbers);
        Integer min = Collections.min(numbers);
        return min >= LOWEST_NUMBER && max <= HIGHEST_NUMBER;
    }
}
