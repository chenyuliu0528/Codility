class Solution {
    public int solution(int N, int M) {
       int lcm = N / gcd(N,M);
       return lcm;
    }
    private int gcd (int a, int b) {
        if (a % b == 0) {
            return b;
        } 
        return gcd(b, a % b);
    }
}
/*** 
//version 1 score: 62/ correctness: 100/ Performance: 25
//Time-out problem
//Detected time complexity: O(N + M) >  O(log(N+M)).

import java.util.HashSet;
class Solution {
    public int solution(int N, int M) {
        // write your code in Java SE 8
        int eatNum = 0;
        long next = 0;

        HashSet<Long> HS = new HashSet<>();
        HS.add((long)0);
        eatNum++;
        
        for (int i = 1; i <= N; i++) {
            next = (next + M) % N;
            if (!HS.contains(next)){
                HS.add(next);
            } else if (HS.contains(next)) {
                eatNum += (i-1);
                break;
            }
        }
        return eatNum;
    }
}
*/