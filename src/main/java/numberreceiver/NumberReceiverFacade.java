package numberreceiver;

import java.util.Map;
import java.util.Set;
import java.util.UUID;

public class NumberReceiverFacade {
    private static NumberReceiverFacade instance;
    private final NumberValidator numberValidator;
    private final NumberRepository numberRepository;

    NumberReceiverFacade(NumberValidator numberValidator, NumberRepository numberRepository) {
        this.numberValidator = numberValidator;
        this.numberRepository = numberRepository;
    }

    public static NumberReceiverFacade getInstance() {
        if (instance == null) {
            instance = new NumberReceiverFacade(new NumberValidatorImpl(),
                    new InMemoryNumberRepository());
        }
        return instance;
    }

    public ResultMessage inputNumbers(Set<Integer> numbers) {
        if (numberValidator.numberAreValid(numbers)) {
            String hash = UUID.randomUUID().toString();
            numberRepository.save(hash, numbers);
            return new ResultMessage("Accepted", "hash");
        } else {
            return new ResultMessage("Not accepted", "hash");
        }
    }


    public Map<String, Set<Integer>> allNumbersFromUser() {
        return null;
    }
}
