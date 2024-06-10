public class InsertionSortExample {
    public static void insertionSort(int[] array) {
        int n = array.length;
        for(int i=1; i<n; i++) {
            int current = array[i];
            int j = i - 1;

            while(j>=0 && array[j] > current) {
                array[j+1] = array[j];
                j = j - 1;
            }
            array[j+1] = current;
        }
    }
    public static void printArray(int[] array) {
        for (int i=0; i<array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] array = {12,45,7,8,21};

        System.out.println("Original Array: ");
        printArray(array);

        insertionSort(array);

        System.out.println("Sorted Array: ");
        printArray(array);
    }
}
