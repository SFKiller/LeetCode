/**
 * @author: SFKiller
 * Problem Description:
 *     Given a binary tree, find its maximum depth.
 *     The maximum depth is the number of nodes along 
 *     the longest path from the root node down to 
 *     the farthest leaf node.
 */

import 

public class Solution {

    public int maxDepth(TreeNode root) {
        if (null == root)
            return 0;

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        return (left > right) ? (left + 1) : (right + 1);

    }

    class TreeNode {

        TreeNode parent;
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int value) {
            val = value;
        }

    }

}
