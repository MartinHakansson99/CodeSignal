/*
######### DESCRIPTION #########

Construct a square matrix with a size N × N containing integers from 1 to N * N in a spiral order, starting from top-left and in clockwise direction.

Example:
    For n = 3, the output should be

    solution(n) = [[1, 2, 3],
                        [8, 9, 4],
                        [7, 6, 5]]

*/

// NOTE: This was Written i 2017/2018.

int[][] solution(int n) {
    int[][] arr = new int[n][n];
    int val = 1, len = arr.length;
    for(int i = 0; val <= n*n; i++){
        for(int j = 0 +i; j < len -i; j++){
            arr[i][j] = val;
            val++;
        }
        for(int j = i +1; j < len -i; j++){
            arr[j][len -i -1] = val;
            val++;
        }
        for(int j = len -i -2; j > -1 +i; j--){
            arr[len -i -1][j] = val;
            val++;
        }
        for(int j = len -2 -i; j > 0 +i; j--){
            arr[j][0 +i] = val;
            val++;
        }
    }
    return arr;
}