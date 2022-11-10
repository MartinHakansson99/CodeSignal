/*
######### DESCRIPTION #########

Given a rectangular matrix of characters, add a border of asterisks(*) to it.

Example
    For

    picture = ["abc",
            "ded"]
    the output should be
    solution(picture) = ["*****",
                        "*abc*",
                        "*ded*",
                        "*****"]

*/

// NOTE: This was Written i 2017/2018.

String[] solution(String[] picture) {
    String[] pic = new String[picture.length +2];
    pic[0] = "*";
    pic[pic.length-1] = "*";
    for(int i = 0; i < picture[0].length() +1; i++){
        pic[0] += "*";
        pic[pic.length-1] += "*";
    }
    
    for(int i = 0; i < picture.length; i++){
        pic[i+1] = "*" + picture[i] + "*";
    }
    return pic;
}
