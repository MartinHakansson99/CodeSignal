/*
######### DESCRIPTION #########

Given an array of integers, find the pair of adjacent elements that has the largest product and return that product.

Example:
    For inputArray = [3, 6, -2, -5, 7, 3], the output should be
    solution(inputArray) = 21.

    7 and 3 produce the largest product.

*/

// NOTE: This was Written i 2017/2018.

int solution(int[] inputArray) {
    int num = -10000;
    int temp = 0;
    for(int i = 0; i < inputArray.length -1; i++){
        temp = inputArray[i] * inputArray[i+1];
        if(num < temp)
            num = temp;
    }
    return num;
}
