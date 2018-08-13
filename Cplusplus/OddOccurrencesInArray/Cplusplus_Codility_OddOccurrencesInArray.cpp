
int solution(vector<int> &A) {
    // write your code in C++14 (g++ 6.2.0)
    long odd = 0;
    for (int i = 0; i < A.size(); i++) {
        odd ^= (long)A[i];
    }
    return odd;
}