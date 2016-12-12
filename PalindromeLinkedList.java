/**
 * Date 11/29/2016
 * @author Saili Pandit
 * https://leetcode.com/problems/palindrome-linked-list/
 */

/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* splitHalf(struct ListNode* head) {
    struct ListNode* slow=head;
    struct ListNode* fast=head;
    while(fast!=NULL) {
        slow=slow->next;
        fast=fast->next;
        if(fast!=NULL)
            fast=fast->next;
    }
    return slow;
}
struct ListNode* reverse(struct ListNode* head) {
    struct ListNode* current = head;
    struct ListNode* prev = NULL;
    struct ListNode* next = NULL;
    while(current!=NULL) {
        next=current->next;
        current->next=prev;
        prev=current;
        current = next;
    }
    return prev;
}
bool compare(struct ListNode* head1, struct ListNode* head2) {
    while(head1!=NULL && head2!=NULL) {
        if(head1->val != head2->val)
            return false;
        else
        {
            head1=head1->next;
            head2=head2->next;
        }
    }
    return true;
    
}
bool isPalindrome(struct ListNode* head) {
    struct ListNode* head1=head;
    struct ListNode* head2=splitHalf(head);
    head2=reverse(head2);
    return (compare(head1,head2));
}