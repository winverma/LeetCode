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
class Solution 
{
    public ListNode insertionSortList(ListNode head) 
    {
        // Edge case: return the list if it's empty or has only one node
        if (head == null || head.next == null) return head;

        ListNode dummy = new ListNode(0);  // Dummy node to act as the head of the sorted list
        ListNode current = head;           // Pointer to traverse the input list
        ListNode prevSorted = dummy;       // Pointer to traverse the sorted list
        ListNode nextNode;                 // Stores the next node to be processed

        // Iterate through the original list
        while (current != null) 
        {
            nextNode = current.next;  // Cache the next node before modifying `current.next`

            // If the current node is smaller than the previous sorted node, reset`prevSorted`
            if (prevSorted.val >= current.val) prevSorted = dummy;

            // Find the correct position to insert the current node in the sorted part
            while (prevSorted.next != null && prevSorted.next.val < current.val) 
            {
                prevSorted = prevSorted.next;
            }

            // Insert `current` between `prevSorted` and `prevSorted.next`
            current.next = prevSorted.next;
            prevSorted.next = current;

            // Move to the next node in the unsorted list
            current = nextNode;
        }

        // Return the head of the sorted list, skipping the dummy node
        return dummy.next;
    }
}
