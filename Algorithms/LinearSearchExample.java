public class LinearSearchExample {
    public static int LinearSearch(int[] arr, int key){
        for(int i=0; i<arr.length; ++i){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] array = {10,7,5,4,3,2};
        int key = 3;
        int index = LinearSearch(array, key);
        if(index == -1){
            System.out.println("Element "+ key+" Not Found!");
        } else {
            System.out.println("Element Found at "+ index+"th index");
        }
    }
}