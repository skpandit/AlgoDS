/**
 * Date 11/29/2016
 * @author Saili Pandit
 * https://leetcode.com/problems/rotate-list/
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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode current = head;
        if(head==null || k==0)
            return head;
        if(head.next==null)
            return head;
        int count = 0;
        while(current!=null){
            current=current.next;
            count++;
        }
        int rot = k%count;
        if(k%count == 0)
            return head;
        int newCnt = count - rot - 1;
        ListNode newNode = head;
        while(newCnt>0) {
           newNode = newNode.next;
           newCnt--;
        }
        ListNode node = newNode.next;
        ListNode ret = node;
        newNode.next=null;
        while(node.next!=null){
            node=node.next;
        }
        node.next=head;
        head=ret;
        return head;
    }
}
