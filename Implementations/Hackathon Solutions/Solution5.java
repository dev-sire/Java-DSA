// You are given an length x length 2D Matrix representing an image, rotate the image
// by 90 degrees (clockwise).

// Use of another 2D Array not allowed, make sure to modify the original one!

    // 1  2  3       7  4  1
    // 4  5  6 ----> 8  5  2
    // 7  8  9       9  6  3

public class Solution5 {
    public static void rotateMatrix(int[][] arr) {
        int length = arr.length;

        // Transpose the matrix
        for(int i=0;i<length;++i){
            for(int j=0;j<i;++j){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        // Swap the first and last column 
        for(int i=0;i<length;++i){
            for(int j=0;j<length/2;++j){
                int temp = arr[i][j];
                arr[i][j] = arr[i][length-j-1];
                arr[i][length-j-1] = temp;
            }
        }
    }
    public static void printMatrixGrid(int[][] arr){
        for(int i=0; i<arr.length; ++i){
            for(int j=0; j<arr.length; ++j){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int testArr[][] = { {1,2,3}, {4,5,6}, {7,8,9} };
        rotateMatrix(testArr);
        printMatrixGrid(testArr);
    }
}
