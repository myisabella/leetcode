'''
	Given an array with n objects colored red, white or blue, sort them so that
	objects of the same color are adjacent, with the colors in the order red, 
	white and blue. 
	Here, we will use the integers 0, 1, and 2 to represent the color red, 
	white, and blue respectively.
	one-pass algorithm
'''

class Solution:
	def sortColors(self, A):
		r, w, b = 0, 0, len(A) - 1

		while w < b + 1:
			if A[w] == 0: 		# red
				A[w], A[r] = A[r], A[w]
				r, w = r + 1, w + 1
				continue

			if A[w] == 2:		# blue
				A[w], A[b] = A[b], A[w]
				b = b - 1
				continue

			w = w + 1
			
