/*
######### DESCRIPTION #########

Given some integer, find the maximal number you can obtain by deleting exactly one digit of the given number.

Example:
    For n = 152, the output should be
    solution(n) = 52;
    For n = 1001, the output should be
    solution(n) = 101.

*/

// NOTE: This was Written i 2017/2018.

int solution(int n) {
    String s = Integer.toString(n);
    
    for(int i = 0; i < s.length() -1; i++){
        if( s.charAt(i) < s.charAt(i+1))
            return Integer.parseInt(s.substring(0, i) + s.substring(i+1));
    }
        
    int min = find(n);
    int index = s.lastIndexOf((char) (min +48));
    
    return Integer.parseInt(s.substring(0, index) + s.substring(index+1));
}

int find(int n){
    if(n < 10)
        return n;
    return Math.min(n%10, find(n/10));
}