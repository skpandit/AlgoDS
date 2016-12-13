/**
 * Date 11/29/2016
 * @author Saili Pandit
 * https://leetcode.com/problems/ugly-number/
 */

public class Solution {
    public boolean isUgly(int num) {
        HashMap <Integer,Integer> map = new HashMap<Integer,Integer>();
        int n=num;
        if(n==1)
            return true;
        if(n<=0)
            return false;
        else{
            
            if(n%2 == 0)
                map.put(2,2);
            while(n%2 == 0)
            {
                n=n/2;
            }
            for(int i=3; i<=(int)(Math.sqrt(n));i=i+2){
                while(n%i == 0){
                    if(!map.containsKey(i))
                        map.put(i,i);
                    n=n/i;
                }
            }
            if(n>2)
            {
                if(!map.containsKey(n))
                    map.put(n,n);
            }
        }
        boolean containsCommonPrime=false;
        boolean containsUncommonPrime=false;
        for(Integer key: map.keySet()){
            System.out.println(key);
            if(key == 2 || key == 3 || key == 5)
                containsCommonPrime=true;
            else
                containsUncommonPrime=true;
            if((containsCommonPrime == true) && (containsUncommonPrime == true))
                return false;
        }
        if((containsCommonPrime == true) && (containsUncommonPrime == false))
            return true;
        else{
            /*if((containsCommonPrime == false) && (containsUncommonPrime == true))
                return true;
            else*/
                return false;
        }
        
    
    }
}