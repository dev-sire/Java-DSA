public class LongestPalindromeSubstring {
    public String longestPalindrome(String s) {
        int maxLength = 0;
        String maxPalindrome = "";
        for(int i=0; i<s.length(); ++i){
            String oddWord = expand(s, i, i);
            String evenWord = expand(s, i, i+1);
            if(oddWord.length() > maxLength){
                maxPalindrome = oddWord;
                maxLength = oddWord.length();
            }
            if(evenWord.length() > maxLength){
                maxPalindrome = evenWord;
                maxLength = evenWord.length();
            }
        }
        return maxPalindrome;
    }
    public String expand(String s, int left, int right) {
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return s.substring(left + 1, right);
    }
}
