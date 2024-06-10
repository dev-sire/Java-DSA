public class SelectionSortExample {
    public static void selectionSort(int[] array) {
        int n = array.length;
        for(int i=0; i<n-1; ++i) {
            int minIndex = i;
            for(int j=i+1; j<n; ++j) {
                if(array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }
    public static void printArray(int[] array) {
        for(int i=0; i<array.length; ++i) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] array = {12,45,7,8,21};

        System.out.println("Original Array: ");
        printArray(array);

        selectionSort(array);

        System.out.println("Sorted Array: ");
        printArray(array);
    }
}
