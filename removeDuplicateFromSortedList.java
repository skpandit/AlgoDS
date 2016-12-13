/**
 * Date 11/29/2016
 * @author Saili Pandit
 * https://leetcode.com/problems/remove-duplicates-from-sorted-list/
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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null)
            return head;
        if(head.next==null)
            return head;
        int val = head.val;
        ListNode prev = head;
        ListNode current = head.next;
        while(current!=null){
            if(prev.val==current.val)
            {
                prev.next=current.next;
                current=prev.next;
            } else {
                prev=current;
                current=current.next;
            }
        }
        return head;
    }
}