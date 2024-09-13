import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueOccurences {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> count = new HashMap<>();
        Set<Integer> occurences = new HashSet<>();

        for(final int a : arr){
            count.merge(a, 1, Integer::sum);
        }
        for(final int value: count.values()){
            if(!occurences.add(value)){
                return false;
            }
        }
        return true;
    }
}