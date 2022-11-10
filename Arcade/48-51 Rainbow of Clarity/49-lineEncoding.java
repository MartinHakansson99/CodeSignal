/*
######### DESCRIPTION #########

Given a string, return its encoding defined as follows:

First, the string is divided into the least possible number of disjoint substrings consisting of identical characters
for example, "aabbbc" is divided into ["aa", "bbb", "c"]
Next, each substring with length greater than one is replaced with a concatenation of its length and the repeating character
for example, substring "bbb" is replaced by "3b"
Finally, all the new strings are concatenated together in the same order and a new string is returned.

Example:
    For s = "aabbbc", the output should be
    solution(s) = "2a3bc".
*/

// NOTE: This was Written i 2017/2018.

String solution(String s) {
    String encoded = "";
    int count = 1;
    int i = 0;
    while(i < s.length()){
        for(int j = i +1; j < s.length(); j++){
            if(s.charAt(j) != s.charAt(i))
                break;
            else
                count++;
        }
        encoded += count > 1 ? Integer.toString(count) + s.charAt(i) : s.charAt(i) ;
        i += count;
        count = 1;
    }
    return encoded;
}