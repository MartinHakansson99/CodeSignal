/*
######### DESCRIPTION #########

Find the leftmost digit that occurs in a given string.

Example
    For inputString = "var_1__Int", the output should be
    solution(inputString) = '1';
    For inputString = "q2q-q", the output should be
    solution(inputString) = '2';
    For inputString = "0ss", the output should be
    solution(inputString) = '0'.

*/

// NOTE: This was Written i 2017/2018.

char solution(String inputString) {
    Matcher m = Pattern.compile("\\d").matcher(inputString);
    m.find();
    return inputString.charAt(m.start());
}
