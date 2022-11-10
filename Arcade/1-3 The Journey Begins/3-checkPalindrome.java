/*
######### DESCRIPTION #########

Given the string, check if it is a palindrome.

Example
    For inputString = "aabaa", the output should be
    solution(inputString) = true;
    For inputString = "abac", the output should be
    solution(inputString) = false;
    For inputString = "a", the output should be
    solution(inputString) = true.

*/

// NOTE: This was Written i 2017/2018.

boolean solution(String inputString) {
    String reverse = new StringBuffer(inputString).reverse().toString();
    if(inputString.equals(reverse))
        return true;
    else
        return false;
}