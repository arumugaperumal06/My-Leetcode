/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
bool hasCycle(struct ListNode *head) {
    if(head == NULL) return 0;
    struct ListNode* a = head;
    struct ListNode* b = head;

    while(a!=NULL && a->next !=NULL)
    {
        a= a->next->next;
        b= b->next;

        if(a ==b) return true;
    }
    return false;
}
