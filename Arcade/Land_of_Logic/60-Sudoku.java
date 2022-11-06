/*
######### DESCRIPTION #########

Sudoku is a number-placement puzzle. The objective is to fill a 9 × 9 grid with digits so that each column, each row, and each of the nine 3 × 3 sub-grids that compose the grid contains all of the digits from 1 to 9.

This algorithm should check if the given grid of numbers represents a correct solution to Sudoku.

Example:

    For
    grid = [[1, 3, 2, 5, 4, 6, 9, 8, 7],
            [4, 6, 5, 8, 7, 9, 3, 2, 1],
            [7, 9, 8, 2, 1, 3, 6, 5, 4],
            [9, 2, 1, 4, 3, 5, 8, 7, 6],
            [3, 5, 4, 7, 6, 8, 2, 1, 9],
            [6, 8, 7, 1, 9, 2, 5, 4, 3],
            [5, 7, 6, 9, 8, 1, 4, 3, 2],
            [2, 4, 3, 6, 5, 7, 1, 9, 8],
            [8, 1, 9, 3, 2, 4, 7, 6, 5]]
    the output should be
    solution(grid) = true;

    For
    grid = [[8, 3, 6, 5, 3, 6, 7, 2, 9],
            [4, 2, 5, 8, 7, 9, 3, 8, 1],
            [7, 9, 1, 2, 1, 4, 6, 5, 4],
            [9, 2, 1, 4, 3, 5, 8, 7, 6],
            [3, 5, 4, 7, 6, 8, 2, 1, 9],
            [6, 8, 7, 1, 9, 2, 5, 4, 3],
            [5, 7, 6, 9, 8, 1, 4, 3, 2],
            [2, 4, 3, 6, 5, 7, 1, 9, 8],
            [8, 1, 9, 3, 2, 4, 7, 6, 5]]
    the output should be
    solution(grid) = false.

    The output should be false: each of the nine 3 × 3 sub-grids should contain all of the digits from 1 to 9.

*/

// NOTE: This was Written i 2017/2018.

boolean solution(int[][] grid) {
    int j = 0, k = 0;
    List<List<Integer>> lists = new ArrayList<>();
    for (int[] ints : grid) {
        List<Integer> list = new ArrayList<>();
        for (int i : ints) {
            list.add(i);
        }
    lists.add(list);
    }
    
    // x across
    
    for(int i = 0; i < 9; i++){
        for(j = 1; j <= 9; j++){
            if(lists.get(i).indexOf(j) != lists.get(i).lastIndexOf(j))
                return false;
        }
    }
    
    // y across
    
    List<Integer> temp = new ArrayList<>();
    for(int i = 0; i < 9; i++){
        for(j = 0; j < 9; j++){
            temp.add(lists.get(j).get(i));
        }
        for(j = 1; j <= 9; j++){
            if(temp.indexOf(j) != temp.lastIndexOf(j))
                return false;
        }
        temp.clear();
    }
    
    // 3x3
    
    for(int i = 0; i < 3; i++){
        for(j = 0; j < 3; j++){
            for(k = 0 + (3*i); k < 3 + (3*i); k++){
                for(int h = 0 +(3*j); h < 3 +(3*j); h++){
                    temp.add(lists.get(k).get(h));
                }
            }
            for(k = 1; k <= 9; k++){
                if(!temp.contains(k))
                    return false;
            }
            temp.clear();
        }
    }    
    return true;
}