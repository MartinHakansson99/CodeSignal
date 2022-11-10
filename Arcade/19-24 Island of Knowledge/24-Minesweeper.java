/*
######### DESCRIPTION #########

In the popular Minesweeper game you have a board with some mines and those cells that don't contain a mine have a number in it that indicates the total number of mines in the neighboring cells. Starting off with some arrangement of mines we want to create a Minesweeper game setup.

Example
    For

    matrix = [[true, false, false],
            [false, true, false],
            [false, false, false]]
    the output should be

    solution(matrix) = [[1, 2, 1],
                        [2, 1, 1],
                        [1, 1, 1]]

*/

// NOTE: This was Written i 2017/2018.

int[][] solution(boolean[][] matrix) {
    int[][] num = new int[matrix.length][matrix[0].length];
    for(int i = 0; i < matrix.length; i++){
        for(int j = 0; j < matrix[0].length; j++){
            num[i][j] = filter(matrix, i, j);
        }
    }
    return num;
}

int filter(boolean[][] matrix, int x, int y){
    int sum = 0;
    for(int i = 0; i < 3; i++){
        for(int j = 0; j < 3; j++){
            try{
                if(matrix[x+i -1][y+j -1] && !(j == 1 && i == 1))
                    sum++;
            } catch(Exception e){
            
            }
            
        }
    }
    return sum;
}
