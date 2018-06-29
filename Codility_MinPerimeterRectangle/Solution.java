// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");
import java.lang.Math;
class Solution {
    public int solution(int N) {
        // write your code in Java SE 8
        int minimalPerimeter = 0;
        int sqrt = (int)Math.sqrt(N);
        // System.out.println("sqrt"+sqrt);
        for (int i = 1; i <= sqrt; i++){
            if (N % i == 0){
                if(minimalPerimeter == 0){
                    // System.out.println("2*(i+N/i):" +2*(i+N/i));
                    minimalPerimeter = 2*(i+N/i);
                } else {
                    minimalPerimeter = (minimalPerimeter < 2*(i+N/i))?minimalPerimeter:2*(i+N/i);
                    if (i>12800) {
                        // System.out.println("minimalPerimeter" +minimalPerimeter+" i: "+i+" N/i: "+N/i);
                    }
                }
            }
        }
        return minimalPerimeter;
    }
}