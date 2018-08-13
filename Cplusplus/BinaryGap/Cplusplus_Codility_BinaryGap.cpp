int solution(int N) {
    int binaryRepresentArray [32];
    int i = 0;
    while(N > 0) {
        binaryRepresentArray [i] = N % 2;
        N = N / 2;
        ++i;
    }
    
    int count = 0;
    int max = 0;
    for(int j = 0; j < i; j++) {
        count = 0;
        if(binaryRepresentArray [j] == 1 && j < i) {
            ++j;
            while (binaryRepresentArray [j] == 0 && j < i) {
                ++j;
                ++count;
            }
            if(binaryRepresentArray [j] == 1 && j < i) {
                max = (max > count)?max:count;
                --j;
            }
        }
    }
    return max;
}