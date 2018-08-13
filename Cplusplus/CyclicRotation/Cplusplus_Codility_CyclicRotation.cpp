vector<int> solution(vector<int> &A, int K) {
    // write your code in C++14 (g++ 6.2.0)
    int size = A.size();
    vector<int> afterRotation (size) ;
    
    for(int i = 0; i < size; i++) {
        afterRotation[(i+K)%size] = A[i];
    }
    
    return afterRotation;
}