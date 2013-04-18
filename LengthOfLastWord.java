/**
 * Given a string s consists of upper/lower-case alphabets and empty space 
 * characters ' ', return the length of last word in the string.
 * If the last word does not exist, return 0.
 * Note: A word is defined as a character sequence consists of non-space 
 * characters only.
 *
 * For example, Given s = "Hello World", return 5.
 */

public class Solution {
    public int lengthOfLastWord(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function

    	// empty string case
    	if (s.length() == 0) {
    		return 0;
    	}

    	int count = 0;
    	int len = s.length() - 1;

    	// from end of string, eliminate ' ' character
    	while (len >= 0 && s.charAt(len) == ' ') {
    		len--;
    	}

    	// move to 1st non ' ' character from end of string
    	// count character
    	while (len >= 0 && s.charAt(len) != ' ') {
    		count++;
    		len--;
    	}

    	return count;
    }
}