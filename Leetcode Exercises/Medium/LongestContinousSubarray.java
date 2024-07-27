package Medium;

import java.util.Deque;
import java.util.LinkedList;

public class LongestContinousSubarray {
    public int longestSubarray(int[] nums, int limits){
        if(nums == null || nums.length == 0) return 0;

        Deque<Integer> maxDq = new LinkedList<>();
        Deque<Integer> minDq = new LinkedList<>();
        int i = 0;
        int res = 0;

        for(int j=0; j<nums.length; ++j){
            while (!maxDq.isEmpty() && nums[j] > maxDq.peekLast()){ maxDq.pollLast(); }
            while (!minDq.isEmpty() && nums[j] < minDq.peekLast()){ minDq.pollLast(); }

            maxDq.add(nums[j]);
            minDq.add(nums[j]);

            if(maxDq.peekFirst() - minDq.peekFirst() > limits){
                if(maxDq.peekFirst() == nums[i]){ maxDq.pollFirst(); }
                if(minDq.peekFirst() == nums[i]){ minDq.pollFirst(); }
                i++;
            }
            res = Math.max(res, j - i + 1);
        }
        return res;
    }
}
