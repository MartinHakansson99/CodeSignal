/*
######### DESCRIPTION #########

Given an array of strings, return another array containing all of its longest strings.

Example:
    For inputArray = ["aba", "aa", "ad", "vcd", "aba"], the output should be
    solution(inputArray) = ["aba", "vcd", "aba"].

*/

// NOTE: This was Written i 2017/2018.

String[] solution(String[] inputArray) {
    int length = 0, amt = 0, a = 0;
    for(int i = 0; i < inputArray.length; i++){
        if(inputArray[i].length() > length){
            length = inputArray[i].length();
            amt = 0;
        }
        if(inputArray[i].length() == length)
            amt++;
    }
    
    String[] longString = new String[amt];
    
    for(int i = 0; i < inputArray.length; i++){
        if(inputArray[i].length() == length){
            longString[a] = inputArray[i];
            a++;
        }
    }
    return longString;
}