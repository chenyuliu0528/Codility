// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

//version 1 score 100/100/100
import java.util.Stack;

class Solution {
    public int solution(String S) {
        // write your code in Java SE 8
        int properly_nested = 0;
        if(S == null){
            return properly_nested;
        }
        Stack st = new Stack();
        char[] ch = S.toCharArray();
        for (char c: ch) {
            if (c == '{' || c == '[' || c == '(') {
                st.push(c);
                continue;
            }else if (!st.empty()){
                char peek =  st.peek().toString().charAt(0);
                if  ((c == ')' && peek == '(')|| (c == ']' && peek == '[')||(c == '}' && peek == '{')) {
                    st.pop();
                    continue;
                }
            } else {
                st.push(c);
                break;
            }
        }
        if(st.empty()){
            properly_nested = 1;
        }
        
        return properly_nested;
    }
}




// // you can also use imports, for example:
// // import java.util.*;

// // you can write to stdout for debugging purposes, e.g.
// // System.out.println("this is a debug message");

// //version 1 score 37/33/40
// import java.util.Stack;

// class Solution {
//     public int solution(String S) {
//         // write your code in Java SE 8
//         int properly_nested = 0;
//         if(S == null){
//             return properly_nested;
//         }
//         Stack st = new Stack();
//         char[] ch = S.toCharArray();
//         for (char c: ch) {
//             if (c == '{' || c == '[' || c == '(') {
//                 st.push(c);
//                 continue;
//             }else if (c == ')' && st.peek().toString().charAt(0) == '(') {
//                 st.pop();
//                 continue;
//             }else if (c == ']' && st.peek().toString().charAt(0) == '[') {
//                 st.pop();
//                 continue;
//             }else if (c == '}' && st.peek().toString().charAt(0) == '{') {
//                 st.pop();
//                 continue;
//             }else {
//                 break;
//             }
//         }
//         if(st.empty()){
//             properly_nested = 1;
//         }
        
//         return properly_nested;
//     }
// }