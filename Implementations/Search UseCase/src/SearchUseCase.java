public class SearchUseCase {
    public static int BinarySearch(int[] array, int target){
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            int mid = low+(high-low)/2;
            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
    public static int LinearSearch(int[] arr, int key){
        for(int i=0; i<arr.length; ++i){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int size = 100000;
        int[] array = new int[size];
        for(int i=0; i<size; ++i){
            array[i] = i;
        }
        int key = 99999;

        long startTime = System.nanoTime();
        int linearSearchResult = LinearSearch(array, key);
        long endTime = System.nanoTime();
        long linearSearchTime = endTime - startTime;

        startTime = System.nanoTime();
        int binarySearchResult = BinarySearch(array, key);
        endTime = System.nanoTime();
        long binarySearchTime = endTime - startTime;

        System.out.println("Linear Search Result: ");
        System.out.println("Index: " + linearSearchResult);
        System.out.println("Time Taken in NanoSeconds: "+ linearSearchTime);

        System.out.println("Binary Search Result: ");
        System.out.println("Index: "+ binarySearchResult);
        System.out.println("Time Taken in NanoSeconds: "+ binarySearchTime);

    }
}
