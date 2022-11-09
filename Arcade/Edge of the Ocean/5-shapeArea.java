/*
######### DESCRIPTION #########

Below we will define an n-interesting polygon. Your task is to find the area of a polygon for a given n.

A 1-interesting polygon is just a square with a side of length 1. An n-interesting polygon is obtained by taking the n - 1-interesting polygon and appending 1-interesting polygons to its rim, side by side. You can see the 1-, 2-, 3- and 4-interesting polygons in the picture below.

Example:
    For n = 2, the output should be
    solution(n) = 5;
    For n = 3, the output should be
    solution(n) = 13.

*/

// NOTE: This was Written i 2017/2018.

int solution(int n) {
    int sum = n*2 -1;
    for(int i = n-1; i > 0; i--){
     sum += (i*2 -1)*2;
    }
    return sum;
}
