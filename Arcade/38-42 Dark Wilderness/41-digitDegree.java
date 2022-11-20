/*
######### DESCRIPTION #########

Let's define digit degree of some positive integer as the number of times we need to replace this number with the sum of its digits until we get to a one digit number.

Given an integer, find its digit degree.

Example
    For n = 5, the output should be
    solution(n) = 0;
    For n = 100, the output should be
    solution(n) = 1.
    1 + 0 + 0 = 1.
    For n = 91, the output should be
    solution(n) = 2.
    9 + 1 = 10 -> 1 + 0 = 1.


*/

// NOTE: This was Written i 2017/2018.

int solution(int n) {
    int steps = 0, temp = 0;
    String num = Integer.toString(n);
    while(num.length() > 1){
        for(int i = 0; i < num.length(); i++){
            temp += Integer.parseInt(num.substring(i,i+1));
        }
        num = Integer.toString(temp);
        temp = 0;
        steps++;
    }
    return steps;
}
