/*
######### DESCRIPTION #########

Check if all digits of the given integer are even.

Example
    For n = 248622, the output should be
    solution(n) = true;
    For n = 642386, the output should be
    solution(n) = false.

*/

// NOTE: This was Written i 2017/2018.

boolean solution(int n) {
    return !(Integer.toString(n).matches(".*[13579].*"));
}
