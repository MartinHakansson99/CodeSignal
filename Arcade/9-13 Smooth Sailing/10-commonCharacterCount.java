/*
######### DESCRIPTION #########

Given two strings, find the number of common characters between them.

Example
    For s1 = "aabcc" and s2 = "adcaa", the output should be
    solution(s1, s2) = 3.

*/

// NOTE: This was Written i 2017/2018.

int solution(String s1, String s2) {
    int same = 0;
    for(int i = 0; i < s1.length(); i++){
        for(int j = 0; j < s2.length(); j++){
            if(s1.charAt(i) == s2.charAt(j)){
                s1 = s1.substring(0,i)+'>'+s1.substring(i+1);
                s2 = s2.substring(0,j)+'<'+s2.substring(j+1);
                same++;
            }
        }
    }
    return same;
}
