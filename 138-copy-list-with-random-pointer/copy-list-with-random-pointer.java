/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution 
{
    public Node copyRandomList(Node head) 
    {
        if(head == null) return null;

        Map<Node,Node> map = new HashMap<>();

        for(Node ptr = head; ptr != null; ptr = ptr.next)
        {
            map.put(ptr, new Node(ptr.val));
        }
        
        for(Node ptr = head; ptr != null; ptr = ptr.next)
        {
            map.get(ptr).next = map.get(ptr.next);
            map.get(ptr).random = map.get(ptr.random);
        }
        return map.get(head);
    }
}