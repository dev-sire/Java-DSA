public class PatchingArray {
    public int minPatches(int[] nums, int n) {
        int ans = 0;
        int i = 0;
        long miss = 1;

        while(miss <= n) {
            if(i < nums.length && nums[i] <= miss) {
                miss += nums[i++];
            } else {
                miss += miss;
                ans++;
            }
        }
        return ans;   
    }
}