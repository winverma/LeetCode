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
    public ListNode sortList(ListNode head) 
    {
        if(head == null || head.next == null) return head;

        ListNode mid = midnode(head);

        ListNode left = head;
        ListNode right = mid.next;

        mid.next = null;

        left = sortList(left);
        right = sortList(right);

        return mergelist(left,right);
    }

    public ListNode midnode(ListNode head)
    {
        ListNode slow = head;
        ListNode fast = head;

        ListNode prev = null;

        while(fast != null && fast.next != null)
        {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        return prev;
    }

    public ListNode mergelist(ListNode a, ListNode b)
    {
        if(a == null) return b;
        if(b == null) return a;

        ListNode temp = new ListNode();
        ListNode tail = temp;

        while(a != null && b != null)
        {
            if(a.val < b.val)
            {
                tail.next = a;
                a = a.next;
                tail = tail.next;
            }
            else
            {
                tail.next = b;
                b = b.next;
                tail = tail.next;
            }

            tail.next = (a != null)? a:b;
        }
        return temp.next;
    }
}