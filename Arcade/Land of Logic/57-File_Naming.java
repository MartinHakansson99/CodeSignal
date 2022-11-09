/*
######### DESCRIPTION #########

You are given an array of desired filenames in the order of their creation. Since two files cannot have equal names, the one which comes later will have an addition to its name in a form of (k), where k is the smallest positive integer such that the obtained name is not used yet.

Return an array of names that will be given to the files.

Example
    For names = ["doc", "doc", "image", "doc(1)", "doc"], the output should be
    solution(names) = ["doc", "doc(1)", "image", "doc(1)(1)", "doc(2)"].
*/

// NOTE: This was Written i 2017/2018.

String[] solution(String[] names) {
    List<String> str = new ArrayList<String>();
    int j = 1;
    for(String s: names){
        if(str.contains(s)){
            for(j = 1; str.contains(s + "(" + j + ")"); j++){
                
            }
            s =(s + "(" + j + ")");
        }
            str.add(s);
    }
    String[] arr = new String[str.size()];
    return str.toArray(arr);
}