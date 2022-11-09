/*
######### DESCRIPTION #########

Ratiorg got statues of different sizes as a present from CodeMaster for his birthday, each statue having an non-negative integer size. Since he likes to make things perfect, he wants to arrange them from smallest to largest so that each statue will be bigger than the previous one exactly by 1. He may need some additional statues to be able to accomplish that. Help him figure out the minimum number of additional statues needed.

Example:
    For statues = [6, 2, 3, 8], the output should be
    solution(statues) = 3.

    Ratiorg needs statues of sizes 4, 5 and 7.

*/

// NOTE: This was Written i 2017/2018.

/*
 * Reading this now is quite humbling if i have to be honest...
 * 
*/
int solution(int[] statues) {
    int low = 20, high = -1, duplicates = 0;
    boolean running = true;
    // find lowest
    while(running){
        running = false;
        for(int i = 0; i < statues.length; i++){
            if(statues[i] < low){
                running = true;
                low = statues[i];
            }
        }
    }
    //find highest
    running = true;
    while(running){
        running = false;
        for(int i = 0; i < statues.length; i++){
            if(statues[i] > high){
                running = true;
                high = statues[i];
            }
        }
    }
    return high - low - (statues.length -1);
}