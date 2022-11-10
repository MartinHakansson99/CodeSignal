/*
######### DESCRIPTION #########

Given an array of integers, find the maximal absolute difference between any two of its adjacent elements.

Example
    For inputArray = [2, 4, 1, 0], the output should be
    solution(inputArray) = 3.

*/

// NOTE: This was Written i 2017/2018.

int solution(int[] inputArray) {
    int diff = 0, a = 0, b = 0;
    for(int i = 0; i < inputArray.length -1; i++){
        a = Math.max(inputArray[i], inputArray[i+1]);
        b = Math.min(inputArray[i], inputArray[i+1]);
        if(a - b > diff)
            diff = a-b;
    }
    return diff;
}
