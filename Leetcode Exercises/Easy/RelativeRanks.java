package Easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RelativeRanks {
    public String[] findRelativeRanks(int[] score) {
        final int n = score.length;
        String[] ans = new String[n];
        List<Integer> indices = new ArrayList<>();

        for(int i=0; i<n; ++i)
            indices.add(i);

        Collections.sort(indices, (a, b) -> score[b] - score[a]);

        for(int i=0; i<n; ++i){
            if(i == 0)
                ans[indices.get(0)] = "Gold Medal";
            else if(i == 1)
                ans[indices.get(1)] = "Silver Medal";
            else if(i == 2)
                ans[indices.get(2)] = "Bronze Medal";
            else
                ans[indices.get(i)] = String.valueOf(i + 1);
        }
        return ans;
    }
}