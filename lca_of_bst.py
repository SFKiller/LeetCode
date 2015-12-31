#!/usr/bin/python
"""
    @author SFKiller

    This is a python soluton for leetcode problem:'Lowest Common Ancestor of a Binary Search Tree'

    Problem Description:
        Given a binary search tree(BST), find the lowest common ancestor(LCA) of two
        given nodes in BST.

                     ______6______
                    /             \
                ___2___         ___8___
               /       \       /       \
              0       __4__   7         9
                     /     \
                    3       5

        For example, the lowest common ancestor(LCA) of nodes 2 and 8 is 6. Another
        example is LCA of 2 and 4 is 2, since a node can be a descendant of itself
        according to LCA definition.
"""
class Solution:
    def lowestCommonAncestor(self, root, p, q):
        """
        :type root: TreeNode
        :type p: TreeNode
        :type q: TreeNode
        :retype: TreeNode
        """
        if root is None or p is None or q is None:
            return None
        if (root == p):
            return p
        if (root == q):
            return q
        if ((p.val < root.val and q.val > root.val) or (q.val < root.val and p.val > root.val)):
            return root
        if (p.val < root.val and q.val < root.val):
            return self.lowestCommonAncestor(root.left, p, q)
        if (p.val > root.val and q.val > root.val):
            return self.lowestCommonAncestor(root.right, p, q)
        return root
