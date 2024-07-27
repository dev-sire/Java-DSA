package Easy;

public class CommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0)
            return "";
        
        for(int i=0; i<strs[0].length(); ++i)
            for(int j=0; j<strs.length; ++j)
                if(i == strs[j].length() || strs[j].charAt(i) != strs[0].charAt(i))
                    return strs[0].substring(0, i);

        return strs[0];
    }
}
