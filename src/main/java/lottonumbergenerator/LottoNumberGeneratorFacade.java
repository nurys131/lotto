package lottonumbergenerator;

import java.util.HashSet;
import java.util.Set;

import static configuration.GameConfiguration.*;

public class LottoNumberGeneratorFacade {

    public Set<Integer> winningNumbers() {
        Set<Integer> winningNumbers = new HashSet<>();
        while (winningNumbers.size() < AMOUNT_OF_NUMBERS) {
            int randomNumber = (int) (Math.random() * HIGHEST_NUMBER) + LOWEST_NUMBER;
            winningNumbers.add(randomNumber);
        }
        return winningNumbers;
    }
}
