public class InterpolationSearchExample {
    public static int interpolationSearch(int[] array, int target){
        int low = 0;
        int high = array.length - 1;
        while(low <= high && target <= array[high] && target >= array[low]){
            int probe = low + (high - low) * (target - array[low]) / (array[high] - array[low]);
            System.out.println("Probe: "+ probe);

            if(array[probe] == target){
                return probe;
            } else if(array[probe] < target){
                low = probe + 1;
            } else {
                high = probe - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] array = {1,2,4,8,16,32,64,128,256,512,1024};
        int key = 128;
        int index = interpolationSearch(array, key);
        if(index == -1){
            System.out.println("Element "+ key+" Not Found!");
        } else {
            System.out.println("Element Found at "+ index+"th index");
        }
    }
}
