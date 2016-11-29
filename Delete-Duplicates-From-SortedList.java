 /**
 * Date 11/29/2016
 * @author Saili Pandit
 * https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/
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
        ListNode current = head;
        ListNode prev = null;
        while(current!=null)
        {
            if(current.next!=null)
            {
                if(current.val==current.next.val)
                {
                    ListNode temp = current;
                    while(temp.next!=null && temp.next.val==temp.val){
                        temp=temp.next;
                    }
                    if(prev!=null)
                        prev.next=temp.next;
                    else
                        head=temp.next;
                    current=temp.next;
                    continue;
                }    
                  
            } 
            prev=current;
            current=current.next;
        }
        return head;
    }
}
