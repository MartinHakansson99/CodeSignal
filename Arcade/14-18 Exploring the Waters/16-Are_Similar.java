/*
######### DESCRIPTION #########

Two arrays are called similar if one can be obtained from another by swapping at most one pair of elements in one of the arrays.

Given two arrays a and b, check whether they are similar.

Example
    For a = [1, 2, 3] and b = [1, 2, 3], the output should be
    solution(a, b) = true.
    The arrays are equal, no need to swap any elements.

    For a = [1, 2, 3] and b = [2, 1, 3], the output should be
    solution(a, b) = true.
    We can obtain b from a by swapping 2 and 1 in b.

    For a = [1, 2, 2] and b = [2, 1, 1], the output should be
    solution(a, b) = false.
    Any swap of any two elements either in a or in b won't make a and b equal.

*/

// NOTE: This was Written i 2017/2018.

boolean solution(int[] a, int[] b) {
    List<Integer> wrong = new ArrayList<Integer>();
    for(int i = 0; i < a.length; ++i) {
        if(a[i] != b[i])
            wrong.add(i);
    }
    if(wrong.size() == 0)
        return true;
    if(wrong.size() == 2){
        if(a[wrong.get(0)] == b[wrong.get(1)] && a[wrong.get(1)] == b[wrong.get(0)])
            return true;
    }
    return false;
}
