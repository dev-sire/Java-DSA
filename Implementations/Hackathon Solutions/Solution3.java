// Given an integer array and an integer val, remove all occurences of val in the array.
// The order of the elements may be changed. Then return the number of elements in array
// which are not equal to val.

// Input: nums = [3,2,2,3], val = 3
// Output: 2, nums = [2,2,__,__]

public class Solution3 {

    public static int removeElement(int[] nums, int val) {
        int i = 0;
        for (final int num : nums)
          if (num != val)
            nums[i++] = num;
    
        return i;
    }
    public static void printArray(int[] arr){
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int inputArray[] = {3,2,2,3};  
        int resultant = removeElement(inputArray, 3);

        System.out.println("Modified Array:- ");
        printArray(inputArray);
        System.out.println(resultant);
    }
}