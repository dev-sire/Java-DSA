import java.util.Arrays;

public class SortingExample {
    public static void main(String[] args) throws Exception {
        int[] numbers = {5,2,4,6,1,9,3};

        // Time Complexity: O(nlogn)
        // Space Complexity: O(logn)
        
        Arrays.sort(numbers);
        for (int i : numbers) {
            System.out.print(i+" ");
        }
    }
}