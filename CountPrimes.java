/**
 * Date 11/29/2016
 * @author Saili Pandit
 * https://leetcode.com/problems/count-primes/
 */

public class Solution {
    public int countPrimes(int n) {
        int count=0;
        if(n<=2)
            return count;
        else{
            ++count; //for 2 
            for(int i=3; i<n;i=i+2)
            {   
                if(isPrime(i))
                    ++count;
            }
        }
        return count;
    }
    public boolean isPrime(int n){
        if(n%2==0)
            return false;
        else{
            int i=3;
            while(i<=Math.sqrt(n))
            {
                if(n%i ==0)
                    return false;
                i=i+2;
            }
            return true;
        }
    }
}
 