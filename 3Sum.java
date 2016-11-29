/**
 * Date 11/29/2016
 * @author Saili Pandit
 * https://leetcode.com/problems/3sum/
 */
 
 public class Solution {
    public static boolean findNum (int [] nums, int start,int end,int n) {
        while(start<=end) {
            int mid = start+(end-start)/2;
            if(nums[mid]==n)
                return true;
            if(nums[mid]<n) 
                start=mid+1;
            else
                end=mid-1;
        }
        return false;
    }
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        HashSet <List<Integer>> set = new HashSet<List<Integer>>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            int start=i+1;
            int end=nums.length-1;
            int sum=-nums[i];
            while(start<end){
                if(nums[start]+nums[end]>sum)
                    end=end-1;
                else if(nums[start]+nums[end]<sum)
                    start=start+1;
                else{
                    List<Integer> temp = new ArrayList<Integer>();
                    temp.add(nums[start]);
                    temp.add(nums[end]);
                    temp.add(nums[i]);
                    if(set.contains(temp)) {
                        start=start+1;
                        end=end-1;
                        continue;
                    } else {
                        set.add(temp);
                        ans.add(temp);
                    }
                    start=start+1;
                    end=end-1;
                }
            }
        }
        return ans;
    }
}
