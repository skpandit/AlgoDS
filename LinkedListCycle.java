/**
 * Date 11/29/2016
 * @author Saili Pandit
 * https://leetcode.com/problems/linked-list-cycle/
 */


/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null)
            return false;
        if(head.next==null)
            return false;
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!=null) {
            slow=slow.next;
            if(fast.next.next!=null)
                fast = fast.next.next;
            else
                return false;
            if(fast==slow)
                return true;
        }
        return false;
    }
}