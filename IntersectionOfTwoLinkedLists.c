/**
 * Date 11/29/2016
 * @author Saili Pandit
 * https://leetcode.com/problems/intersection-of-two-linked-lists/
 */
 
/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
int getLength(struct ListNode* head) {
    if(head==NULL)
        return 0;
    struct ListNode* current = head;
    int count=0;
    while(current!=NULL){
        count++;
        current=current->next;
    }
    return count;
}

struct ListNode *getIntersectionNode(struct ListNode *headA, struct ListNode *headB) {
    if(headA==NULL && headB==NULL)
        return NULL;
    int lenA = getLength(headA);
    int lenB = getLength(headB);
    struct ListNode* temp1 = lenA>lenB?headA:headB;
    struct ListNode* temp2 = lenA>lenB?headB:headA;
    int diff=lenA>lenB?lenA-lenB:lenB-lenA;
    while(diff>0) {
        temp1=temp1->next;
        diff--;
    }
    while(temp1!=NULL && temp2!=NULL){
        if(temp1->val==temp2->val)
            return temp1;
        else
        {    temp1=temp1->next;
             temp2=temp2->next;
        }
    }
    return NULL;
}