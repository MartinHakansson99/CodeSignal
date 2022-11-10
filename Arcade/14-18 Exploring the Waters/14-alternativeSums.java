/*
######### DESCRIPTION #########

Several people are standing in a row and need to be divided into two teams. The first person goes into team 1, the second goes into team 2, the third goes into team 1 again, the fourth into team 2, and so on.

You are given an array of positive integers - the weights of the people. Return an array of two integers, where the first element is the total weight of team 1, and the second element is the total weight of team 2 after the division is complete.

Example
    For a = [50, 60, 60, 45, 70], the output should be
    solution(a) = [180, 105].

*/

// NOTE: This was Written i 2017/2018.

int[] solution(int[] a) {
    int[] sum = new int[2];
    for(int i = 0; i < a.length-1; i+=2){
        sum[0] += a[i];
        sum[1] += a[i+1];
    }
    if((a.length&1) == 1)
        sum[0] += a[a.length-1];
    return sum;
}
