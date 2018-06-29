//you can write to stdout for debugging purposes, e.g.
//System.out.println("this is a debug message");
import java.util.Arrays;
class Solution {
    public int solution(int[] A) {
        if( A.length == 0){
            return -1;
        }
        if (A.length == 1){
            return 0;
        }
        // write your code in Java SE 8
        
        //!!!! cant write int[] B = A;!!!
        int[] B = new int[A.length];
        for (int i = 0; i < B.length; i++){
            B[i] = A[i];
        }
        Arrays.sort(A);
        int possible_dominator = A[A.length/2];
        int possition = -1;
        // System.out.println("possible_dominator: "+possible_dominator);
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == possible_dominator) {
                count ++;
            }
        }
        if (count > A.length/2){
            for (int i = 0; i < B.length; i++){
                if (B[i] == possible_dominator) {
                    possition = i;
                    // System.out.println("possition: "+possition);
                    break;
                }
            }
        }else {
            possition = -1;
        }
        // System.out.println("possition b4 return: "+possition);
        return possition;
    }
}