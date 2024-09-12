public class MaxNumOfVowelInSubstring {
    public int maxVowels(String s, int k) {
        int count = 0;
        for(int i=0; i<k; ++i){
            if(isVowel(s.charAt(i))){
                ++count;
            }
        }
        int ans = count;
        for(int i=k; i<s.length(); ++i){
            if(isVowel(s.charAt(i))){
                ++count;
            }
            if(isVowel(s.charAt(i - k))){
                --count;
            }
            ans = Math.max(ans, count);
        }
        return ans;
    }
    private boolean isVowel(char c){
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'; 
    }
}