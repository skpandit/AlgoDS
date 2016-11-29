/**
 * Date 11/29/2016
 * @author Saili Pandit
 * https://leetcode.com/problems/single-number-iii/
 */
 public class Solution {
    public int[] singleNumber(int[] nums) {
        int [] res = new int[2];
        if(nums.length==0)
            return res;
        if(nums.length==2 && nums[0]!=nums[1])
            return nums;
        int xor = 0;
        for(int i=0;i<nums.length;i++){
            xor^=nums[i];
        }
        //partition the array into two
        int index=0;
        int x=1;
        while((xor&x)==0 && index<31){
            x=x<<1;
            ++index;
        }
        ArrayList l1 = new ArrayList();
        ArrayList l2 = new ArrayList();
        int y=1;
        for(int j=0;j<nums.length;j++){
            if((nums[j]&(y<<index))==0)
                l1.add(nums[j]);
            else
                l2.add(nums[j]);
        }
        int xor1=0;
        int xor2=0;
        for(int k=0; k<l1.size();k++)
        {
            xor1=xor1^(int)l1.get(k);
        }
        res[0]=xor1;
        for(int h=0; h<l2.size();h++)
        {
            xor2=xor2^(int)l2.get(h);
        }
        res[1]=xor2;
        return res;
    }
}
