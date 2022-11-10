/*
######### DESCRIPTION #########

You are given an array of integers representing coordinates of obstacles situated on a straight line.

Assume that you are jumping from the point with coordinate 0 to the right. You are allowed only to make jumps of the same length represented by some integer.

Find the minimal length of the jump enough to avoid all the obstacles.

Example
    For inputArray = [5, 3, 6, 7, 9], the output should be
    solution(inputArray) = 4.

*/

// NOTE: This was Written i 2017/2018.

int solution(int[] inputArray) {
    boolean same = true;
    for(int i = 2; i < 11; i++){
        for(int a: inputArray){
            if(a%i == 0){
                same = false;
                break;
            }
        }
        if(same)
            return i;
        same = true;
    }
    return -1;
}
