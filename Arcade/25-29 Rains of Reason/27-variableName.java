/*
######### DESCRIPTION #########

Correct variable names consist only of English letters, digits and underscores and they can't start with a digit.

Check if the given string is a correct variable name.

Example
    For name = "var_1__Int", the output should be
    solution(name) = true;
    For name = "qq-q", the output should be
    solution(name) = false;
    For name = "2w2", the output should be
    solution(name) = false.

*/

// NOTE: This was Written i 2017/2018.

boolean solution(String name) {
    char temp = '0';
    if( Character.isLetter(name.charAt(0)) || name.charAt(0) == '_'){
        for(int i = 0; i < name.length(); i++){
            temp = name.charAt(i);
            if(!(Character.isDigit(temp) || Character.isLetter(temp) || temp == '_')){
                return false;
            }
        }
        return true;
    }
    return false;
}
