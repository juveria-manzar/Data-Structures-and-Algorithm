/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // First pointer will point to
        // the head of the linked list
        ListNode first = head;
 
        // Second pointer will point to the
        // Nth node from the beginning
        ListNode second = head;
        for (int i = 0; i < n; i++) {
 
            // If count of nodes in the given
            // linked list is <= N
            if (second.next == null) {
                // If count = N i.e. delete the head node
                if (i == n - 1)
                    head = head.next;
                return head;
            }
            second = second.next;
        }
        
        // Increment both the pointers by one until
        // second pointer reaches the end
        while (second.next != null) {
            first = first.next;
            second = second.next;
        }
 
        // First must be pointing to the
        // Nth node from the end by now
        // So, delete the node first is pointing to
        ListNode nbr = first.next;
        first.next = nbr.next;
        nbr.next = null;
        return head;
    }
}