/*

206. Reverse Linked List

Description: Reverse a singly linked list.

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
    public ListNode reverseList(ListNode head) {
        ListNode result = null;
        ListNode current = head;
        ListNode Next = null;
        while(current != null){
            Next = current.next;
            current.next = result;
            result = current;
            current = Next;
        }
        head = result;
        return head;
        
    }
}