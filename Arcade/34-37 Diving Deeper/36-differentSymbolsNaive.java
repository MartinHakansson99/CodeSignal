/*
######### DESCRIPTION #########

Given a string, find the number of different characters in it.

Example
    For s = "cabca", the output should be
    solution(s) = 3.

    There are 3 different characters a, b and c.

*/

// NOTE: This was Written i 2017/2018.

int solution(String s) {
    boolean[] arr = new boolean[26];
    int sum = 0;
    for(char c: s.toCharArray()){
        if(!arr[c - 'a']){
            sum++;
            arr[c - 'a'] = true;
        }
    }
    return sum;
}
