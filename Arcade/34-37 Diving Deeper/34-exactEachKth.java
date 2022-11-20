/*
######### DESCRIPTION #########

Given array of integers, remove each kth element from it.

Example
    For inputArray = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10] and k = 3, the output should be
    solution(inputArray, k) = [1, 2, 4, 5, 7, 8, 10].

*/

// NOTE: This was Written i 2017/2018.

int[] solution(int[] inputArray, int k) {
    int len = inputArray.length - inputArray.length/k;
    int[] output = new int[len];
    for(int i = 0; i < len; i++){
        output[i] = inputArray[i + i/(k-1)];
    }
    return output;
}
