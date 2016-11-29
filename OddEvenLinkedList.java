 /**
 * Date 11/29/2016
 * @author Saili Pandit
 * https://leetcode.com/problems/odd-even-linked-list/
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
    public ListNode oddEvenList(ListNode head) {
        ListNode current = head;
        ListNode oddEnd=head;
        if(head==null)
            return null;
        else if (head.next==null)
            return head;
        int count = 1;
        ListNode evenStart = head.next;
        while(current.next!=null) {
            ListNode next = current.next;
            if(count%2 == 1){
                current.next=next.next;
                oddEnd=current;
            }
            if (count %2 == 0)
                current.next=next.next;    
            count++;
            current = next;
        }
        if(oddEnd.next != null)
            oddEnd.next.next=evenStart;
        else
            oddEnd.next=evenStart;
        return head;
    }
}
