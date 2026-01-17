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
    public ListNode reverseList(ListNode head) {
        ListNode fast = head;
        ListNode node = null;

        while(fast != null){
            ListNode temp = fast.next;
            fast.next = node;
            node = fast;
            fast = temp;
        }

        return node;

    }
}