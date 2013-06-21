/**
 * Given n non-negative integers a1, a2, ..., an, where each represents a point 
 * at coordinate (i, ai). n vertical lines are drawn such that the two endpoints
 * of line i is at (i, ai) and (i, 0). Find two lines, which together with 
 * x-axis forms a container, such that the container contains the most water.
 *
 * Time: O(N)
 */

public class Solution {
    public int maxArea(int[] height) {
        // Start typing your Java solution below
        // DO NOT write main() function

        // avoid only one point case
        if (height.length < 2) {
        	return 0;
        }

        int area = 0;
        int leftPos = 0;
        int rightPos = height.length - 1;

        // use two pointer to loop from left and right with greedy strategy
        while (leftPos < rightPos) {
        	int tempArea = Math.abs(rightPos - leftPos) * Math.min(height[leftPos], height[rightPos]);
        	if (tempArea > area) {
        		area = tempArea;
        	}

        	if (height[leftPos] < height[rightPos]) {
        		leftPos++;
        	} else {
        		rightPos--;
        	}
        }

        return area;
    }
}