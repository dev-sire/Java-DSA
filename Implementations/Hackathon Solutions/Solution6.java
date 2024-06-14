// Code a Roman To Integer Converter using the following Table

//     Symbol  Value

//     I       1
//     V       5       
//     X       10
//     L       50
//     C       100
//     D       500
//     M       1000

// Input: s = "LVIII"
// Output: 58

// L = 50, V = 5, III = 3

public class Solution6 {
    public static int romanToIntConverter(String s) {
        int ans = 0;
        int[] roman = new int[128];
        roman['I'] = 1;
        roman['V'] = 5;
        roman['X'] = 10;
        roman['L'] = 50;
        roman['C'] = 100;
        roman['D'] = 500;
    
        for (int i=0;i+1< s.length();++i){
          if (roman[s.charAt(i)]<roman[s.charAt(i+1)])
            ans -= roman[s.charAt(i)];
          else
            ans += roman[s.charAt(i)];
        }
        return ans+roman[s.charAt(s.length()-1)];
    }
    public static void main(String[] args) {
        int testResult = romanToIntConverter("LVIII");
        System.out.println(testResult);
    }    
}
