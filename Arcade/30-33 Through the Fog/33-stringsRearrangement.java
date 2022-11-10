/*
######### DESCRIPTION #########

Given an array of equal-length strings, you'd like to know if it's possible to rearrange the order of the elements in such a way that each consecutive pair of strings differ by exactly one character. Return true if it's possible, and false if not.

Note: You're only rearranging the order of the strings, not the order of the letters within the strings!

Example
    For inputArray = ["aba", "bbb", "bab"], the output should be
    solution(inputArray) = false.
    There are 6 possible arrangements for these strings:
    ["aba", "bbb", "bab"]
    ["aba", "bab", "bbb"]
    ["bbb", "aba", "bab"]
    ["bbb", "bab", "aba"]
    ["bab", "bbb", "aba"]
    ["bab", "aba", "bbb"]
    None of these satisfy the condition of consecutive strings differing by 1 character, so the answer is false.

    For inputArray = ["ab", "bb", "aa"], the output should be
    solution(inputArray) = true.
    It's possible to arrange these strings in a way that each consecutive pair of strings differ by 1 character (eg: "aa", "ab", "bb" or "bb", "ab", "aa"), so return true.

*/

// NOTE: This was Written i 2017/2018.

ArrayList<ArrayList<String>> permutations = new ArrayList<ArrayList<String>>();

boolean solution(String[] inputArray) {
    List<String> arr = new ArrayList<String>();
    
    for (String s: inputArray) {
		arr.add(s);
	}
    permutations(new ArrayList<String>(), arr);
    for(ArrayList<String> current: permutations){
        if(diffByOne(current))
            return true;
    }
    return false;
}

boolean diffByOne(ArrayList<String> arr){
    int diff = 0;
    for(int i = 1; i < arr.size(); i++){
        for(int j = 0; j < arr.get(0).length(); j++){
            if(arr.get(i-1).charAt(j) != arr.get(i).charAt(j))
                diff++;
        }
        if(diff != 1)
            return false;
        diff = 0;
    }
    return true;
}



void permutations(ArrayList<String> curr, List<String> notUsed){
    if(notUsed.size() == 0){
        permutations.add(new ArrayList<String>(curr));
        return;
    }
    for(String s: notUsed){
        ArrayList<String> newCurr = new ArrayList<>(curr);
        List<String> newNotUsed = new ArrayList<String>(notUsed);
        newCurr.add(s);
        newNotUsed.remove(s);
        permutations(newCurr, newNotUsed);
    }
}
