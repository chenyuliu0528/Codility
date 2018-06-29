// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        int profit = 0;
        if(A.length <= 1){
            return profit;
        }
        
        int temp_minumum = A[0];

    
        for (int i = 0; i < A.length; i++) {
            if (A[i] < temp_minumum) {
                temp_minumum = A[i];
            } else if (A[i] > temp_minumum) {
                profit= ((A[i] - temp_minumum)>profit)?A[i] - temp_minumum:profit;
            }
        }
        return profit;
    }
}
