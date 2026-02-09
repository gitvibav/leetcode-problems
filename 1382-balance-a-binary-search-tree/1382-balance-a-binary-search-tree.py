# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def balanceBST(self, root: Optional[TreeNode]) -> Optional[TreeNode]:
        vals = []
        self.inorder(vals, root)
        return self.build(vals, 0, len(vals) - 1)

    def inorder(self, vals, root):
        if not root:
            return
        self.inorder(vals, root.left)
        vals.append(root.val)
        self.inorder(vals, root.right)

    def build(self, vals, l, r):
        if l > r:
            return None
        mid = (l+r)//2
        node = TreeNode(vals[mid])
        node.left = self.build(vals, l, mid-1)
        node.right = self.build(vals, mid+1, r)
        return node
    
