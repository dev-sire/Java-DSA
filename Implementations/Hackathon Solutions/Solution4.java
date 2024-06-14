// Given two non-negative integers num1 and num2 represented as strings,
// return the product of num1 and num2, also represented as a strings

// Input: num1 = "2", num2 = "3"
// Output: "6"

public class Solution4 {
    public static String multiplyString(String num1, String num2) {
        if ("0".equals(num1) || "0".equals(num2)) {
            return "0";
        }
        int m = num1.length(); 
        int n = num2.length();
        int[] arr = new int[m + n];

        for (int i=m-1;i>=0;--i) {
            int a = num1.charAt(i) - '0';
            for (int j=n-1;j>=0;--j) {
                int b = num2.charAt(j) - '0';
                arr[i + j + 1] += a * b;
            }
        }
        for (int i=arr.length-1;i>0;--i) {
            arr[i-1] += arr[i] / 10;
            arr[i] %= 10;
        }
        int i = arr[0] == 0 ? 1 : 0;
        StringBuilder ans = new StringBuilder();
        while(i<arr.length){
            ans.append(arr[i]);
            i++;
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        String product = multiplyString("2", "3");
        System.out.println(product);
    }
}
