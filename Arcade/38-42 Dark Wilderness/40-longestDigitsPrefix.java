/*
######### DESCRIPTION #########

Given a string, output its longest prefix which contains only digits.

Example
    For inputString = "123aa1", the output should be
    solution(inputString) = "123".

*/

// NOTE: This was Written i 2017/2018.

String solution(String inputString) {
    if(!inputString.matches(".*\\d+.*"))
        return "";
    Matcher m = Pattern.compile("\\d+").matcher(inputString);
    m.find();
    return m.start() == 0 ? m.group() : "";
}
