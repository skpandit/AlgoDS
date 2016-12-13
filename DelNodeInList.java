/**
 * Date 11/29/2016
 * @author Saili Pandit
 * https://leetcode.com/problems/delete-node-in-a-linked-list/
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
    public void deleteNode(ListNode node) {
        if(node == null)
            return;
        if(node.next!=null)
        {    
            ListNode next=node.next.next;
            int nextVal=node.next.val;
            node.next=next;
            node.val=nextVal;
        }
        else
            node=null;
    }
}