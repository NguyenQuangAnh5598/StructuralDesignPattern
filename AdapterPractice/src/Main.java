import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        CollectionOperations collectionOperations = new CollectionUtilsAdapter();
        Client client = new Client(collectionOperations);
        Set<Integer> integerSet = new HashSet<>();
        integerSet.add(45);
        integerSet.add(1);
        integerSet.add(55);
        integerSet.add(23);
        client.printMaxValue(integerSet);
    }
}
