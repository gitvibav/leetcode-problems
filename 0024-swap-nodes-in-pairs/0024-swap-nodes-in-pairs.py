# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def swapPairs(self, head: Optional[ListNode]) -> Optional[ListNode]:
        dummy = ListNode(0, head)
        prev, curr = dummy, head

        while curr and curr.next:
            npn = curr.next.next
            second = curr.next

            second.next = curr
            curr.next = npn
            prev.next = second

            prev = curr
            curr = npn

        return dummy.next

#      1     2.       3         4

# p    c     s       npn

#      2     1        3         4
#            p        c         s      npn