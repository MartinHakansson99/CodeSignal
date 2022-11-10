/*
######### DESCRIPTION #########

Some people are standing in a row in a park. There are trees between them which cannot be moved. Your task is to rearrange the people by their heights in a non-descending order without moving the trees. People can be very tall!

Example
    For a = [-1, 150, 190, 170, -1, -1, 160, 180], the output should be
    solution(a) = [-1, 150, 160, 170, -1, -1, 180, 190].

*/

// NOTE: This was Written i 2017/2018.

int[] solution(int[] a) {
    boolean sorted = false;
    int temp = 0;
    while(!sorted){
        sorted = true;
        for(int i = 0; i < a.length; i++){
            if(a[i] == -1)
                continue;
            for(int j = 0; j < a.length - i; j++){
                if(a[i] > a[i+j] && a[i+j] != -1){
                    temp = a[i];
                    a[i] = a[i+j];
                    a[i+j] = temp;
                    sorted = false;
                }    
            }
        }
    }
    return a;
}
