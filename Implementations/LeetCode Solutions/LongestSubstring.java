import java.util.Arrays;

public class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int ans = 0;
        int j = -1;

        int[] lastSeen = new int[128];
        Arrays.fill(lastSeen, -1);

        for (int i = 0; i < s.length(); ++i) {
            j = Math.max(j, lastSeen[s.charAt(i)]);
            ans = Math.max(ans, i - j);
            lastSeen[s.charAt(i)] = i;
        }
        return ans;
    }
}
