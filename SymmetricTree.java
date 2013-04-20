/**
 * Q101: Symmetric Tree
 * Given a binary tree, check whether it is a mirror of itself 
 * (i.e. symmetric around its center)
 *
 * Judge Small: 484 ms, Judge Large: 644 ms
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
	/**
	 * Overload isSymmetric function to have two args
	 * Check if it is symmetric recursively
	 */
    public boolean isSymmetric(TreeNode p, TreeNode q) {
    	/* null node case */
        if (p == null && q == null) {
            return true;
        } else if (p == null || q == null) {
            return false;
        }
        
        /* check node's val */
        if (p.val != q.val) {
            return false;
        }
        
        /* check recursively */
        return isSymmetric(p.left, q.right) && isSymmetric(p.right, q.left);
    }
    
    public boolean isSymmetric(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        
        if (root == null) {
            return true;
        }
        
        return isSymmetric(root.left, root.right);
    }
}