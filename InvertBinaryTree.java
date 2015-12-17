/**
 *    @author SFKiller
 *
 *    This is a java solution for LeetCode problem: Invert Binary Tree
 *
 *    Problem Description:
 *        Invert a binary tree:
 *                4
 *               / \
 *              2   7
 *             /\   /\
 *            1  3 6  9
 *        to:
 *
 *                4
 *               / \
 *              7   2
 *             /\   /\
 *            9  6 3  1
 *
 */

public class InvertBinaryTree {

    private TreeNode tn;

    public InvertBinaryTree() {
        tn = null;
    }

    public TreeNode invertTree(TreeNode root) {
        if (null == root) return root;

        if (null == root.left && null == root.right) return root;

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x;}
    }

    public void creatBinaryTree(TreeNode node, int val) {
        if (null == tn) {
            tn = new TreeNode(val);
        } else {
            if (val < node.val) {
                if (null == node.left) {
                    node.left = new TreeNode(val);
                } else {
                    creatBinaryTree(node.left, val);
                }
            } else {
                if (null == node.right) {
                    node.right = new TreeNode(val);
                } else {
                    creatBinaryTree(node.right, val);
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
        int[] a = {4,2,7,1,3,6,9};
        InvertBinaryTree ibt = new InvertBinaryTree();
        for (int i = 0; i < a.length; i++) {
            ibt.creatBinaryTree(ibt.tn, a[i]);
        }

        ibt.invertTree(ibt.tn);

        ibt.printTree(ibt.tn);
    }
}
