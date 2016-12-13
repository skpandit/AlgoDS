/**
 * Date 11/29/2016
 * @author Saili Pandit
 * https://leetcode.com/problems/merge-two-sorted-lists/
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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode newList ;
        if(l1==null && l2==null)
            return l1;
        if(l1==null)
            return l2;
        if(l2==null)
            return l1;
        else {
            ListNode prev = null;
            ListNode head=null;
           while(l1!=null && l2!=null) {
               if (l1.val<l2.val) {
                newList = new ListNode(l1.val);l1=l1.next;}
               else {
                newList = new ListNode(l2.val);l2=l2.next;}
                if(prev!=null)
                    prev.next=newList;
                else
                    head=newList;
                prev=newList;
           }
           if(l1==null)
            prev.next=l2;
           else
            prev.next=l1;
           return head;
        }
        
    }
}