/*
######### DESCRIPTION #########

CodeMaster has just returned from shopping. He scanned the check of the items he bought and gave the resulting string to Ratiorg to figure out the total number of purchased items. Since Ratiorg is a bot he is definitely going to automate it, so he needs a program that sums up all the numbers which appear in the given input.

Help Ratiorg by writing a function that returns the sum of numbers that appear in the given inputString.

Example:
    For inputString = "2 apples, 12 oranges", the output should be
    solution(inputString) = 14.

*/

// NOTE: This was Written i 2017/2018.

int solution(String input) {
    input = input.replaceAll("[^0-9 ]", " ");
    input = input.trim().replaceAll("[ +]", " ");
    String[] splited = input.split("\\s+");
    if(splited[0].isEmpty())
        return 0;
    int sum = 0;
    for(int i = 0; i < splited.length; i++){
        sum += Integer.parseInt(splited[i]);
    }
    return sum;
}