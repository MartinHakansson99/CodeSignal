/*
######### DESCRIPTION #########

Given a position of a knight on the standard chessboard, find the number of different moves the knight can perform.

The knight can move to a square that is two squares horizontally and one square vertically, or two squares vertically and one square horizontally away from it. The complete move therefore looks like the letter L. Check out the image below to see all valid moves for a knight piece that is placed on one of the central squares.

Example:
    For cell = "a1", the output should be
    solution(cell) = 2.

    For cell = "c2", the output should be
    solution(cell) = 6.
*/

// NOTE: This was Written i 2017/2018.

int solution(String cell) {
    String a = Character.toString(cell.charAt(0)), b = Character.toString(cell.charAt(1));
    if(cell.matches("[c-f3-6]+"))
        return 8;
    if(cell.matches("[b-g2-7]+")){
        if(a.matches("[bg]") && b.matches("[27]"))
            return 4;
        return 6;
    }
    if(a.matches("[c-f]") || b.matches("[3-6]"))
        return 4;
    
    if(a.matches("[bg]") || b.matches("[27]"))
        return 3;
    return 2;
}