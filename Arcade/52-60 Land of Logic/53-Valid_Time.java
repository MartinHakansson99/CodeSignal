/*
######### DESCRIPTION #########

Check if the given string is a correct time representation of the 24-hour clock.

Example:
    For time = "13:58", the output should be
    solution(time) = true;
    For time = "25:51", the output should be
    solution(time) = false;
    For time = "02:76", the output should be
    solution(time) = false.

*/

// NOTE: This was Written i 2017/2018.

boolean solution(String time) {
    return Integer.parseInt(time.substring(0, 2)) < 24 && Integer.parseInt(time.substring(3, 5)) < 60;
}