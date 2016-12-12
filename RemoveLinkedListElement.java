/**
 * Date 11/29/2016
 * @author Saili Pandit
 * https://leetcode.com/problems/remove-linked-list-elements/
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
    public ListNode removeElements(ListNode head, int val) {
        if(head == null)
            return head;
        if(head.next==null && head.val==val)
            return null;
        ListNode current = head;
        ListNode previous = null;
        boolean first=false;
        boolean removed=false;
        while(current!=null){
            if(current.val==val)
            {
                if(previous==null){
                    head=head.next;
                    first=true;
                }
                else{
                    previous.next=current.next;
                    removed=true;
                }
            }
            if(first == true){
                previous=null;
                first=false;
            }
            else{
                if(!removed)
                previous=current;
                else
                    removed=false;
            }
            current=current.next;
        }
        return head;
    }
}
