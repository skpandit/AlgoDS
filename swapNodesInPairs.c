/**
 * Date 11/29/2016
 * @author Saili Pandit
 * https://leetcode.com/problems/swap-nodes-in-pairs/
 */

/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* swapPairs(struct ListNode* head) {
    if(head==NULL)
        return head;
    if(head->next==NULL)
        return head;
    struct ListNode* first = head;
    struct ListNode* second = head->next;
    struct ListNode* previous = NULL;
    struct ListNode* temp = NULL;
    while(true) {
        first->next=second->next;
        second->next=first;
        if(first==head)
            head=second;
        temp=first;
        if(previous!=NULL)
            previous->next=second;
        previous=temp;
        first=first->next;
        if(first==NULL)
            break;
        second=first->next;
        if(second==NULL)
            break;
       
    }
    return head;
}