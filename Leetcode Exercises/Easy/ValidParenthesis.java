package Easy;

import java.util.Stack;

public class ValidParenthesis {
    public boolean isValid(String s){
        if(s.length()%2 != 0){
            return false;
        }

        Stack<Character> cStack = new Stack<>();

        for (char c : s.toCharArray()) {
            if(c == '(' || c == '{' || c == '['){
                cStack.push(c);
            }
            else if(c == ')' && !cStack.isEmpty() && cStack.peek() == '('){
                cStack.pop();
            }
            else if(c == '}' && !cStack.isEmpty() && cStack.peek() == '{'){
                cStack.pop();
            }
            else if(c == ']' && !cStack.isEmpty() && cStack.peek() == '['){
                cStack.pop();
            }
            else{
                return false;
            }
        }
        return cStack.isEmpty();
    }   
}
