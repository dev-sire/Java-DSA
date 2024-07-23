package Easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortThePeople {
    public String[] sortPeople(String[] names, int[] heights) {
        List<Pair<Integer, String>> heightAndNames = new ArrayList<>();

        for (int i = 0; i < names.length; ++i)
            heightAndNames.add(new Pair<>(heights[i], names[i]));

        Collections.sort(heightAndNames, (a, b) -> b.getKey() - a.getKey());

        for (int i = 0; i < heightAndNames.size(); ++i)
            names[i] = heightAndNames.get(i).getValue();

        return names;
    }
}