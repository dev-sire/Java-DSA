import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneLetterCombination {
    Map<Integer,String> map = new HashMap<>();
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if (digits == null || digits.length() == 0) return res;
        map.put(2,"abc");
        map.put(3,"def");
        map.put(4,"ghi");
        map.put(5,"jkl");
        map.put(6,"mno");
        map.put(7,"pqrs");
        map.put(8,"tuv");
        map.put(9,"wxyz");
        helper(res, digits, new StringBuilder(), 0);
        return res;
    }

    private void helper(List<String> res, String digits, StringBuilder sb, int pos) {
        if (pos == digits.length()) {
            res.add(sb.toString());
            return;
        }
        int length = sb.length();
        String cur = map.get(digits.charAt(pos) - '0');
        for (int i = 0; i < cur.length(); ++i) {
            sb.append(cur.charAt(i));
            helper(res,digits,sb,pos + 1);
            sb.setLength(length);
        }
    }
}
