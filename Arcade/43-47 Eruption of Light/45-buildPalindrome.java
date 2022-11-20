/*
######### DESCRIPTION #########

Given a string, find the shortest possible string which can be achieved by adding characters to the end of initial string to make it a palindrome.

Example
    For st = "abcdc", the output should be
    solution(st) = "abcdcba".

*/

// NOTE: This was Written i 2017/2018.

String solution(String s) {
    int len = s.length();
    String sr = new StringBuilder(s).reverse().toString();

    for(int i = 0; i < len; i++){
        if(s.substring(i).equals(sr.substring(0, len -i))){
            return s.substring(0, i) + sr;
        }
    }
    return "";
}
