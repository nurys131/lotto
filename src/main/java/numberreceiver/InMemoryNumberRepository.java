package numberreceiver;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class InMemoryNumberRepository implements NumberRepository{

    private Map<String, Set<Integer>> storage = new HashMap<>();

    @Override
    public void save(String hash, Set<Integer> numbers) {
        storage.put(hash, numbers);
    }
}
