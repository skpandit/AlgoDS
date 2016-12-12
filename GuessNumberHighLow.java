/**
 * Date 11/29/2016
 * @author Saili Pandit
 * https://leetcode.com/problems/guess-number-higher-or-lower/
 */

/* The guess API is defined in the parent class GuessGame.
   @param num, your guess
   @return -1 if my number is lower, 1 if my number is higher, otherwise return 0
      int guess(int num); */

public class Solution extends GuessGame {
    public int rangeGuessNum(int start,int end) {
        int ans = 0;
        while(start<=end) {
            int mid = start + (end-start)/2;
            if(guess(mid)==0){
                ans = mid;break;}
            else if (guess(mid)==-1)
                end = mid-1;
            else
                start=mid+1;
        }
        return ans;
    }
    public int guessNumber(int n) {
        if(n==1)
            return 1;
        return rangeGuessNum(1,n);
    }
}