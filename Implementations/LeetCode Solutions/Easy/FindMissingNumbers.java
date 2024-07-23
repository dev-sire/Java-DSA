package Easy;

public class FindMissingNumbers {
    public int missingNumbers(int[] nums){
        int ans = nums.length;

        for(int i=0; i < nums.length; ++i)
            ans ^= i ^ nums[i];
        
        return ans;
    }
}
