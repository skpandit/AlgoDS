/**
 * Date 11/29/2016
 * @author Saili Pandit
 * https://leetcode.com/problems/add-two-numbers/
 */
 
 /**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
 
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
          ListNode result=null;
        ListNode head=null;
        ListNode next=null;
        if (l1==null && l2==null)
            return null;
        int carry=0;
        int sum=0;
        while(l1!=null || l2!=null){
            sum+=carry;
            if(l1!=null){
                sum+=l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                sum+=l2.val;
                l2=l2.next;
            }
            if(sum>9)
                carry=1;
            else
                carry=0;
            if(result==null){
            	result=new ListNode(sum%10);
            	head=result;
            	}
            else{
            	result.next=new ListNode(sum%10);
            	result=result.next;
            	}
            sum=0;
        }
        if(carry==1)
        {
            result.next=new ListNode(1);
        }
        return head;
    }
}
