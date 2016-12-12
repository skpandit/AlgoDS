/**
 * Date 11/29/2016
 * @author Saili Pandit
 * https://leetcode.com/problems/contains-duplicate-ii/
 */

public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(k<=0)
            return false;
        HashMap <Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i]))
            {
                if((i-map.get(nums[i])) <= k)
                    return true;
                else
                    map.put(nums[i],i);
            }
            else{
                map.put(nums[i],i);
            }
        }
        return false;
    }
}
