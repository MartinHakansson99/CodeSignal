/*
######### DESCRIPTION #########

Write a function that reverses characters in (possibly nested) parentheses in the input string.

Input strings will always be well-formed with matching ()s.

Example
    For inputString = "(bar)", the output should be
    solution(inputString) = "rab";
    For inputString = "foo(bar)baz", the output should be
    solution(inputString) = "foorabbaz";
    For inputString = "foo(bar)baz(blim)", the output should be
    solution(inputString) = "foorabbazmilb";
    For inputString = "foo(bar(baz))blim", the output should be
    solution(inputString) = "foobazrabblim".
    Because "foo(bar(baz))blim" becomes "foo(barzab)blim" and then "foobazrabblim".

*/

// NOTE: This was Written i 2017/2018.

String solution(String s) {
    int left = 0, right = 0, offset = 0;
    while(s.contains("(")){
        left = s.lastIndexOf("(");
        right = s.indexOf(")", left);
        offset = s.length() > right ? 1 : 0;
        s = s.substring(0, left) + new StringBuilder(s.substring(left+1, right)).reverse().toString() + s.substring(right+offset);
    }
    return s;
}
