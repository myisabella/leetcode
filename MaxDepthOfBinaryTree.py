'''
  Given a binary tree, find its maximum depth.
  The maximum depth is the number of nodes along the longest
  path from the root node down to the fartherest leaf node.
'''

# Definition for a binary tree node
# class TreeNode:
#   def __init__(self, x):
#     self.val = x
#     self.left = None
#     self.right = None

class Solution:
  # @param root, a tree node
  # @return an integer
  def maxDepth(self, root):
    if root is None:
      return 0
      
    leftDepth = self.maxDepth(root.left)
    rightDepth = self.maxDepth(root.right)
    
    return leftDepth + 1 if leftDepth > rightDepth else rightDepth + 1
