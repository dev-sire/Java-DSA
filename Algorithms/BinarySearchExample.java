public class BinarySearchExample {

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
    public static void main(String[] args) {
        int[] array = {2,4,6,8,10,12};
        int key = 10;
        int index = BinarySearch(array, key);
        if(index == -1){
            System.out.println("Element "+ key+" Not Found!");
        } else {
            System.out.println("Element Found at "+ index+"th index");
        }
    }    
}
