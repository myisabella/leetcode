'''
  Given an array of integers, every element appears twice except for one. 
  Find that single one.
  Note: 
  Your algorithm should have a linear run complexity without extra memory.
'''

class Solution:
  # @param A, a list of integer
  # @return an integer
  def singleNumber(self, A):
    res = 0
    for item in A:
      res ^= item
      
    return res
