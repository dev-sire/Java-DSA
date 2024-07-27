package Medium;

public class NumberOfNiceSubArrays{
    public int numberOfSubarrays(int[] nums, int k) {
        return numberOfSubarraysAtMost(nums, k) - numberOfSubarraysAtMost(nums, k - 1);
    }
    private int numberOfSubarraysAtMost(int[] nums, int k){
        int ans = 0;
        int right = 0;
        int left = 0;

        while(right <= nums.length){
            if(k >= 0){
                ans += right - left;
                if(right == nums.length)
                    break;
                if(nums[right] % 2 == 1)
                    --k;
                ++right;
            } else {
                if(nums[left]%2 == 1)
                    ++k;
                ++left;
            }
        }
        return ans;
    }
}