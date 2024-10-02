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
        if (head == null) return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = head;
        ListNode curr = head.next;

        while (curr != null) 
        {
            if (prev.val <= curr.val) 
            {
                prev = curr;
                curr = curr.next;
            } 
            else 
            {
                ListNode temp = dummy;
                while (temp.next != null && temp.next.val < curr.val) 
                {
                    temp = temp.next;
                }
                prev.next = curr.next;
                curr.next = temp.next;

                temp.next = curr;
                curr = prev.next;
            }
        }

        return dummy.next;
    }
}