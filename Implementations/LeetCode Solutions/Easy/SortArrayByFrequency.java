package Easy;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

class T {
    public int num;
    public int freq;
    public T(int num, int freq) {
        this.num = num;
        this.freq = freq;
    }
};

public class SortArrayByFrequency {
    public int[] frequencySort(int[] nums) {
        int[] ans = new int[nums.length];
        int ansIndex = 0;
        Map<Integer, Integer> count = new HashMap<>();
        Queue<T> heap = new PriorityQueue<>((a, b) -> a.freq == b.freq ? b.num - a.num : a.freq - b.freq);

        for (final int num : nums)
            count.merge(num, 1, Integer::sum);

        for (Map.Entry<Integer, Integer> entry : count.entrySet())
            heap.offer(new T(entry.getKey(), entry.getValue()));

        while (!heap.isEmpty()) {
            final int num = heap.peek().num;
            final int freq = heap.poll().freq;
            for (int i = 0; i < freq; ++i)
                ans[ansIndex++] = num;
        }
        return ans;
    }
}
