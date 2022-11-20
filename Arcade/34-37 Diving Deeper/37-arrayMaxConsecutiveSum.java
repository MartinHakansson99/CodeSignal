/*
######### DESCRIPTION #########

Given array of integers, find the maximal possible sum of some of its k consecutive elements.

Example
    For inputArray = [2, 3, 5, 1, 6] and k = 2, the output should be
    solution(inputArray, k) = 8.
    All possible sums of 2 consecutive elements are:

    2 + 3 = 5;
    3 + 5 = 8;
    5 + 1 = 6;
    1 + 6 = 7.
    Thus, the answer is 8.

*/

// NOTE: This was Written i 2017/2018.

int solution(int[] inputArray, int k) {
    int max = 0, current = 0;
    for(int i = 0; i <= inputArray.length - k; i++){
        for(int j = i; j < i + k; j++){
            current += inputArray[j];
        }
        if(current > max)
            max = current;
        current = 0;
    }
    return max;
}
