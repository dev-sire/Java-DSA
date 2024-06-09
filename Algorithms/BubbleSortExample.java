public class BubbleSortExample {
    public static void bubbleSort(int[] arr){
        int n = arr.length;
        for(int i=0; i<n-1; ++i){
            for(int j=0; j<n-i-1; ++j){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void printArray(int[] arr){
        for(int i=0; i<arr.length; ++i){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {64,32,67,90,21,45};
        System.out.println("Original Array");
        printArray(arr);
        
        bubbleSort(arr);
        
        System.out.println("Sorted Array");
        printArray(arr);
    }
}
