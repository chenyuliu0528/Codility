class Solution {
    public static final int FAIL = -1;
    public int solution(int[] A) {
        // write your code in Java SE 8
        int passingCars = 0;
        int countZero = 0;
        if (A.length > 100000) {
            passingCars = FAIL;
            return passingCars;
        }
        for (int i = 0; i < A.length; i++) {
            if (A[i] > 100000) {
                passingCars = FAIL;
                break;
            }
            if (A[i] == 0) {
                countZero++;
            }
            if (A[i] == 1 && countZero != 0) {
                passingCars += countZero;
                if (passingCars > 1000000000) {
                    passingCars = FAIL;
                    break;
                 }
            }
        }
        return passingCars;
    }
}