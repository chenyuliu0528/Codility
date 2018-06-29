// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");
import java.util.Stack;
class Solution {
    public int solution(String S) {
        // write your code in Java SE 8
        //default false;
        int properly_nested = 0;
        
        Stack st = new Stack();
        char[] ch = S.toCharArray();
        for(char c: ch){
            if (c == '('){
                st.push('(');
            }else if (c == ')') {
                if (!st.empty()){
                 st.pop();
                } else {
                    st.push(')');
                    break;
                }
            }
        }
        if (st.empty()){
            properly_nested = 1;
        }
        
        return properly_nested;
    }
}