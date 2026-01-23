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

class Solution {
    public Node copyRandomList(Node head) {
        HashMap<Node,Node> hm = new HashMap<>();
        Node temp = head;
        while(temp != null){
            Node new1 = new Node(temp.val);
            hm.put(temp, new1);
            temp = temp.next;
        }

        Node iterator = head;
        while(iterator != null){
            Node deepCopy = hm.get(iterator);
            deepCopy.next = (iterator.next != null) ? hm.get(iterator.next) : null;
            deepCopy.random = (iterator.random != null) ? hm.get(iterator.random) : null;
            iterator = iterator.next;
        }

        return hm.get(head);
    }
}