/**
 * Q104: Maximum Depth of Binary Tree
 * Given a binary tree, find its max depth.
 * The max depth is the number of nodes along the longest path from the root
 * node down to the farthest leaf node
 */

/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public int maxDepth(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        
        /* null case */
        if (root == null) {
        	return 0;
        }

        int leftLen = maxDepth(root.left);
        int rightLen = maxDepth(root.right);
        int count = leftLen > rightLen ? leftLen : rightLen;

        return count + 1;
    }
}