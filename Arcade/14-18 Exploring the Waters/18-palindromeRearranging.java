/*
######### DESCRIPTION #########

Given a string, find out if its characters can be rearranged to form a palindrome.

Example
    For inputString = "aabb", the output should be
    solution(inputString) = true.

    We can rearrange "aabb" to make "abba", which is a palindrome.

*/

// NOTE: This was Written i 2017/2018.

boolean solution(String inputString) {
    boolean single = false;
    int[] counts = new int[256];

    for (int i = 0; i < inputString.length(); i++) {
        char charAt = inputString.charAt(i);
        counts[(int) charAt]++;
    }
    for (int i = 0; i < counts.length; i++) {
        if((counts[i]&1) == 0)
            continue;
        if((counts[i]&1) == 1 && (inputString.length()&1) == 1){
            if(single)
                return false;
            single = true;
        }
        else
            return false;
    }
    return true;
}
