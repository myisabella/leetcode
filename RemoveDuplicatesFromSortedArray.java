/**
 * Given a sorted array, remove the duplicates in place such that each element 
 * appear only once and return the new length.
 * Do not allocate extra space for another array, you must do this in place 
 * with constant memory.
 * 
 * Method: 
 */

public class Solution {
    public int removeDuplicates(int[] A) {
    	// Start typing your Java solution below
        // DO NOT write main() function

    	// empty array or only one element array case
    	// do not need to remove any element
        if (A.length <= 1) {
        	return A.length;
        }

        int newSize = 0;
        int len = A.length;
        for (int i = 1; i < len; i++) {
        	if (A[newSize] != A[i]) {
        		newSize++;
        		A[newSize] = A[i];
        	}
        }
        return newSize + 1;
    }
}