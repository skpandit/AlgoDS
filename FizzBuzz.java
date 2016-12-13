/**
 * Date 11/29/2016
 * @author Saili Pandit
 * https://leetcode.com/problems/fizz-buzz/
 */

public class Solution {
    public List<String> fizzBuzz(int n) {
        List l = new ArrayList <String>();
        if(n==0)
            return l;
        for(int i=1;i<=n;i++){
            if(i%3 == 0 && i%5==0)
                l.add("FizzBuzz");
            else if (i%3 == 0)
                l.add("Fizz");
            else if (i%5==0)
                l.add("Buzz");
            else
                l.add(String.valueOf(i));
        }
        return l;
    }
}