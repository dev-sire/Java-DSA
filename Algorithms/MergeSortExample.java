public class MergeSortExample {
    public static void mergeSort(int[] array) {
        if(array == null || array.length < 2) {
            return;
        }
        int n = array.length;
        int[] temp = new int[n];
        mergeSortHelper(array, temp, 0, n-1);
    }
    public static void mergeSortHelper(int[] array, int[] temp, int left, int right) {
        if(left < right) {
            int mid = left + (right - left) / 2;
            mergeSortHelper(array, temp, left, mid);
            mergeSortHelper(array, temp, mid+1, right);
            merge(array, temp, left, mid, right);
        }
    }
    public static void merge(int[] array, int[] temp, int left, int mid, int right) {
        for(int i=left; i<=right; ++i){
            temp[i] = array[i];
        }
        int i = left;
        int j = mid + 1;
        int k = left;

        while(i<=mid && j<=right) {
            if(temp[i] <= temp[j]) {
                array[k] = temp[i];
                i++;
            } else {
                array[k] = temp[j];
                j++;
            }
            k++;
        }
        while(i<=mid) {
            array[k] = temp[i];
            i++;
            k++;
        }
        while(j<=right) {
            array[k] = temp[j];
            j++;
            k++;
        }
    }
    public static void printArray(int[] array) {
        for(int i=0; i<array.length; ++i) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] array =  {23,21,67,27,3,98,113};
        
        System.out.println("Original Array: ");
        printArray(array);

        mergeSort(array);

        System.out.println("Sorted Array: ");
        printArray(array);
    }
}
