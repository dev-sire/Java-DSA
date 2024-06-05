import java.util.*;

public class RemovingDuplicates {

    public static int[] removeDuplicates(int[] inputArray) {
        if (inputArray.length == 0) {
            return new int[0]; 
        }

        Set<Integer> uniqueElements = new HashSet<>(inputArray.length); 
        for (int num : inputArray) {
            uniqueElements.add(num);
        }

        int[] resultArray = new int[uniqueElements.size()];
        int i = 0;
        for (int num : uniqueElements) {
            resultArray[i++] = num;
        }
        return resultArray;
    }
    public static void main(String[] args) {
        int[] arr = {23, 45, 45, 45, 67};
        int[] removed = removeDuplicates(arr);
        System.out.println(removed);
    }
}
