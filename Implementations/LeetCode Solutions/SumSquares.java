public class SumSquares {
    public static boolean jugdeSquareSum(int c){
        int left = 0;
        int right = (int) Math.sqrt(c);

        while(left <= right){
            final int sum = left*left + right*right;
            if(sum == c){
                return true;
            }
            if(sum < c){
                ++left;
            } else {
                --right;
            }
        }
        return false;
    }
}
