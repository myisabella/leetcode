/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

/**
 * Iterative way: using queue poll function to get the head node,
 * and compare to see if match. If so, remove the matched nodes.
 * After iterating all levels, if the size of queue is not zero,
 * then it must not be symmetric.
 */
public class Solution {
    public boolean isSymmetric(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        
        // check null tree case
        if (root == null) {
        	return true;
        } else {
        	Queue<TreeNode> subLeft = new Linkedlist<TreeNode> ();
        	Queue<TreeNode> subRight = new Linkedlist<TreeNode> ();

        	subLeft.add(root.left);
        	subRight.add(root.right);

        	while (subLeft.size() > 0 && subRight.size() > 0) {
        		TreeNode leftNode = subLeft.poll();
        		TreeNode rightNode = subRight.poll();

        		if (leftNode == null && rightNode == null) {
        			continue;
        		} else if (leftNode == null
        				|| rightNode == null
        				|| leftNode.val != rightNode.val) {
        			return false;
        		} else {
        			subLeft.add(leftNode.left);
        			subLeft.add(leftNode.right);
        			subRight.add(rightNode.left);
        			subRight.add(rightNode.right);
        		}
        	}

        	if (subLeft.size() != 0 || subRight.size() != 0) {
        		return false;
        	}

        	return true;
        }

    }
}