/*
######### DESCRIPTION #########

Given an integer product, find the smallest positive (i.e. greater than 0) integer the product of whose digits is equal to product. If there is no such integer, return -1 instead.

Example
    For product = 12, the output should be
    solution(product) = 26;
    For product = 19, the output should be
    solution(product) = -1.
*/

// NOTE: This was Written i 2017/2018.

int solution(int product) {
    if(product == 0)
        return 10;
    if(String.valueOf(product).length() == 1)
        return product;
    if(isPrime(product))
        return -1;
    
    boolean factorFound = false;
    int ans = 0;
    ArrayList<Integer> factors = new ArrayList<Integer>();
    while(product != 1){
        factorFound = false;
        for(int i = 9; i > 1; i--){
            if(product%i == 0){
                factors.add(i);
                product = product/i;
                factorFound = true;
                break;
            }
        }
        if(!factorFound)
            return -1;
    }
    Collections.sort(factors, Collections.reverseOrder()); 
    for(int i = 0; i < factors.size(); i++){
        ans += factors.get(i) * Math.pow(10, i);
    }
    return ans;
}

boolean isPrime(int n){
    if(n == 2)
        return true;
    if(n == 3)
        return true;
    if(n == 1)
        return false;
    if(n % 2 == 0)
        return false;
    if(n % 3 == 0)
        return false;

    int i = 5;
    int w = 2;

    while (i * i <= n){
        if(n % i == 0)
            return false;
        i += w;
        w = 6 - w;
    }
    return true;
}