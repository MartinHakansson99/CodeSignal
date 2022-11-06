/*
######### DESCRIPTION #########

Define a word as a sequence of consecutive English letters. Find the longest word from the given string.

Example:
    For text = "Ready, steady, go!", the output should be
    solution(text) = "steady"

*/

// NOTE: This was Written i 2017/2018.

String solution(String text) {
    int index = 0;
    String currentlongest = "";
    text = text.replaceAll("[^A-Za-z ]", " ");
    while(text.length() > 0){
        index = text.indexOf(' ') == -1 ? text.length() : text.indexOf(' ');
        if(index > currentlongest.length()){
            currentlongest = text.substring(0, index);
        }
        
        if(!text.contains(" "))
            break;
        text = text.substring(index+1);
    }
    return currentlongest;
}