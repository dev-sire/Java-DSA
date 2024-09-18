package Easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UncommonWords {
    public String[] uncommonFromSentences(String s1, String s2) {
        List<String> ans = new ArrayList<>();
        Map<String, Integer> count = new HashMap<>();
        for (final String word : (s1 + ' ' + s2).split(" "))
            count.merge(word, 1, Integer::sum);
        for (final String word : count.keySet())
            if (count.get(word) == 1)
                ans.add(word);
        return ans.toArray(new String[0]);
    }
}