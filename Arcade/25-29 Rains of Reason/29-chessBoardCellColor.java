/*
######### DESCRIPTION #########

Given two cells on the standard chess board, determine whether they have the same color or not.

Example
    For cell1 = "A1" and cell2 = "C3", the output should be
    solution(cell1, cell2) = true.

    For cell1 = "A1" and cell2 = "H3", the output should be
    solution(cell1, cell2) = false.

*/

// NOTE: This was Written i 2017/2018.

boolean solution(String cell1, String cell2) {
    int a = cell1.charAt(0) + cell1.charAt(1),
    b = cell2.charAt(0) + cell2.charAt(1);
    return (a & 1) == (b & 1);
}
