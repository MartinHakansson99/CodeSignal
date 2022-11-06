/*
######### DESCRIPTION #########

Given a rectangular matrix containing only digits, calculate the number of different 2 × 2 squares in it.

Example:
    For
    matrix = [[1, 2, 1],
            [2, 2, 2],
            [2, 2, 2],
            [1, 2, 3],
            [2, 2, 1]]
    the output should be

    solution(matrix) = 6.
*/

// NOTE: This was Written i 2017/2018.

int solution(int[][] matrix) {
    int current = 0;
    ArrayList<Integer> known = new ArrayList<Integer>();
    for(int i = 0; i < matrix.length -1; i++){
        for(int j = 0; j < matrix[0].length -1; j++){
            current = matrix[i][j] + (matrix[i +1][j] * 10) + (matrix[i][j +1] * 100) + (matrix[i +1][j +1] * 1000);
            if(!known.contains(current))
                known.add(current);
        }
    }
    return known.size();
}