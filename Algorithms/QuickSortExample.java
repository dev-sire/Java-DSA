public class QuickSortExample {
    public static void quickSort(int[] array, int start, int end) {
        if(end <= start) return;
        
        int pivot = partition(array, start, end);
        quickSort(array, start, pivot - 1);
        quickSort(array, pivot + 1, end);
    }
    public static int partition(int[] array, int start, int end) {
        int pivot = array[end];
        int i = start - 1;
        for(int j=start; j<=end; ++j) {
            if(array[j] < pivot){
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        i++;
        int temp = array[i];
        array[i] = array[end];
        array[end] = temp;

        return i;
    }
    public static void printArray(int[] array) {
        for(int i=0; i<array.length; ++i) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] array = {8,3,1,5,9,4,7,2};
        int n = array.length;

        System.out.println("Original Array: ");
        printArray(array);

        quickSort(array, 0, n-1);

        System.out.println("Sorted Array: ");
        printArray(array);
    }
}
