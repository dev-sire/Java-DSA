package BinarySearch;

public class FindPeakElement {
    public int findPeakElement(int[] nums) {
        if (nums == null) return -1;
        if (nums.length == 1) return 0;
        
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < nums[mid+1]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
}