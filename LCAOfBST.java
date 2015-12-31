/**
 * @author SFKiller
 *
 * This is a java solution for leetcode problem: 'Lowest Common Ancestor of a Binary Search Tree'
 *
 * Problem Description:
 *     Given a binary search tree(BST), find the lowest common ancestor(LCA) of two
 *     given nodes in BST.
 *
 *                    ______6______
 *                   /             \
 *               ___2___         ___8___
 *              /       \       /       \
 *             0       __4__   7         9
 *                    /     \
 *                   3       5
 *
 *     For example, the lowest common ancestor(LCA) of nodes 2 and 8 is 6. Another
 *     example is LCA of 2 and 4 is 2, since a node can be a descendant of itself 
 *     according to LCA definition.
 */
public class LCAOfBST {
    TreeNode root;

    public LCAOfBST() {
        root = null;
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (null == root || null == p || null == q) return null;
        if (root == p) return p;
        if (root == q) return q;
        if ((p.val < root.val && q.val > root.val) || (p.val > root.val && q.val < root.val)) {
            return root;
        }
        if (p.val < root.val && q.val < root.val) {
            return lowestCommonAncestor(root.left, p, q);
        }
        if (p.val > root.val && q.val > root.val) {
            return lowestCommonAncestor(root.right, p, q);
        }
        return root;
    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; };
    }

    public void createBinaryTree(TreeNode node, int val) {
        if (null == node) {
            node = new TreeNode(val);
        } else {
            if (val < node.val) {
                if (null == node.left) {
                    node.left = new TreeNode(val);
                } else {
                    createBinaryTree(node.left, val);
                }
            } else {
                if (null == node.right) {
                    node.right = new TreeNode(val);
                } else {
                    createBinaryTree(node.right, val);
                }
            }
        }
    }

    public void printTree(TreeNode root) {
        if (null != root) {
            System.out.println(root.val);
            printTree(root.left);
            printTree(root.right);
        }
    }

    public static void main(String[] args) {
        int[] a = {6,2,8,0,4,7,9,3,5};
        LCAOfBST lcaOfbst = new LCAOfBST();
        for (int i : a) {
            lcaOfbst.createBinaryTree(lcaOfbst.root, i);
        }
    }
}
