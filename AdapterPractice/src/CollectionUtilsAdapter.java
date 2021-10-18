import com.codegym.CollectionUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class CollectionUtilsAdapter implements CollectionOperations{
    CollectionUtils collectionUtils = new CollectionUtils();
    @Override
    public int findMax(Set<Integer> numbers) {
        List<Integer> integerList = new ArrayList<>();
        integerList.addAll(numbers);
       int max = collectionUtils.findMax(integerList);
        return max;
    }
}
