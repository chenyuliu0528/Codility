// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");
import java.lang.Math;
class Solution {
    public int solution(int N) {
        int factorsNum = 0;
        int NSqrt = (int)Math.sqrt(N);
        for (int i = 1; i <= NSqrt; i++) {
            if (N % i == 0) {
                if(i != N/i) {
                    factorsNum +=2 ;
                }else {
                    //e.g., 9 = 3*3, 3 only counts once.
                    factorsNum++;
                }
            }
        }
        return factorsNum;
    }
}