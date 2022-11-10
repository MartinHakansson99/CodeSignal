/*
######### DESCRIPTION #########

Given a string, your task is to replace each of its characters by the next one in the English alphabet; i.e. replace a with b, replace b with c, etc (z would be replaced by a).

Example
    For inputString = "crazy", the output should be solution(inputString) = "dsbaz".

*/

// NOTE: This was Written i 2017/2018.

String solution(String inputString) {
    String returnString = "";
    for(char c: inputString.toCharArray()){
        returnString += (char)((c - 'a' + 1) % 26 + 'a');
    }
    return returnString;
}
