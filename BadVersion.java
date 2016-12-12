/**
 * Date 11/29/2016
 * @author Saili Pandit
 * https://leetcode.com/problems/first-bad-version/
 */

/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int recurBadVersion(int start, int end) {
        int ans = 0;
        while(start<=end) {
            int mid = start + (end-start)/2;
            if(mid==start)
            {
                ans=isBadVersion(mid)==true?mid:mid+1;
                break;
            }
            if(isBadVersion(mid))
                end=mid;
            else {
                start=mid;}
        }
        return ans;
    }
    public int firstBadVersion(int n) {
        if(n==1)
            return isBadVersion(n)==true?1:0;
        return recurBadVersion(1,n);
    }
    
}