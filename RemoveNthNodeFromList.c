/**
 * Date 11/29/2016
 * @author Saili Pandit
 * https://leetcode.com/problems/remove-nth-node-from-end-of-list/
 */

/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* removeNthFromEnd(struct ListNode* head, int n) {
    struct ListNode* current = head;
    struct ListNode* nNode = head;
    while(n>0) {
        nNode=nNode->next;
        n--;
    }
    struct ListNode* prev = NULL;
    while(nNode!=NULL) {
        prev=current;
        current=current->next;
        nNode=nNode->next;
    }
    if(current==head)
        head=current->next;
    else
        prev->next=current->next;
    return head;
}