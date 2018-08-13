int solution(vector<int> &A) {
    // write your code in C++14 (g++ 6.2.0)
    int sum = ((1+ A.size()+1)*(A.size()+1)/2);

    for(int i = 0; i < A.size(); i++) {
        sum-=A[i];
    }
    return sum;
}