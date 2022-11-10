/*
######### DESCRIPTION #########

An IP address is a numerical label assigned to each device (e.g., computer, printer) participating in a computer network that uses the Internet Protocol for communication. There are two versions of the Internet protocol, and thus two versions of addresses. One of them is the IPv4 address.

Given a string, find out if it satisfies the IPv4 address naming rules.

Example
    For inputString = "172.16.254.1", the output should be
    solution(inputString) = true;

    For inputString = "172.316.254.1", the output should be
    solution(inputString) = false.
    316 is not in range [0, 255].

    For inputString = ".254.255.0", the output should be
    solution(inputString) = false.
    There is no first number.

*/

// NOTE: This was Written i 2017/2018.

// I did not know what regex was when i solved this problem.

boolean solution(String inputString) {
    List<Integer> dots = new ArrayList<Integer>();
    int temp = 0;
    for(int i = 0; i < inputString.length(); i++){ 
        if(inputString.charAt(i) == '.')
            dots.add(i);
    }
    if(dots.size() != 3)
        return false;
    try{
        temp = Integer.parseInt(inputString.substring(0, dots.get(0)));
        System.out.println(temp);
        if(!(temp > -1 && temp < 256))
            return false;
        
        for(int i = 0; i < 2; i++){
            temp = Integer.parseInt(inputString.substring(dots.get(i) +1, dots.get(i+1)));
            System.out.println(temp);
            if(!(temp > -1 && temp < 256))
                return false;
        }
        temp = Integer.parseInt(inputString.substring(dots.get(2) +1));
        System.out.println(temp);
        if(!(temp > -1 && temp < 256))
            return false;
    } catch(Exception e){
        return false;
    }
    
    return true;
}
