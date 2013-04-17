/**
 * Given an array and a value, remove all instances of that value in place 
 * and return the new length.
 * The order of elements can be changed. It doesn't matter what you leave 
 * beyond the new length.
 * 
 * Method: reconstruct array since we don't care the order of elements
 */

public class Solution {
    public int removeElement(int[] A, int elem) {
        // Start typing your Java solution below
        // DO NOT write main() function

    	// check empty array case
    	if (A.length == 0) {
    		return 0;
    	}

    	int newSize = 0;
    	for (int item : A) {
    		if (item != elem) {
    			A[newSize] = item;
    			newSize++;
    		}
    	}

    	return newSize;
    }
}