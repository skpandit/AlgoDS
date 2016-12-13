/**
 * Date 11/29/2016
 * @author Saili Pandit
 * https://leetcode.com/problems/reverse-linked-list/
 */

/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* reverseList(struct ListNode* head) {
    if(head==NULL)
        return head;
    if(head->next==NULL)
        return head;
    struct ListNode* current = head;
    struct ListNode* prev = NULL;
    struct ListNode* next;
    while(current!=NULL){
        next=current->next;
        current->next=prev;
        prev=current;
        current=next;
    }
    return prev;
}