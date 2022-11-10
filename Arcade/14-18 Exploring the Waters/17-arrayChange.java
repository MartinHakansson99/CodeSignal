/*
######### DESCRIPTION #########

You are given an array of integers. On each move you are allowed to increase exactly one of its element by one. Find the minimal number of moves required to obtain a strictly increasing sequence from the input.

Example
    For inputArray = [1, 1, 1], the output should be
    solution(inputArray) = 3.

*/

// NOTE: This was Written i 2017/2018.

int solution(int[] inputArray) {
    int sum = 0, a = 0, b = 0;
    
    for(int i = 0; i < inputArray.length -1; i++){
        a = inputArray[i];
        b = inputArray[i+1];
        if(a >= b){
            sum += a -b +1;
            inputArray[i+1] = b + (a-b +1);
        }
    }
    return sum;
}
