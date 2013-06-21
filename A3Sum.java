/**
 * Given an array S of n integers, are there elements a, b, c in S s.t 
 * a + b + c = 0? Find all unique triplets in the array which gives the sum
 * of zero.
 *
 * Map first number in to a hashset, then find 2sum for the target - num[first]
 * Time: O(N^2)
 */
public class Solution {
    public ArrayList<ArrayList<Integer>> threeSum(int[] num) {
        // Start typing your Java solution below
        // DO NOT write main() function
        HashSet<ArrayList<Integer>> res = new HashSet<ArrayList<Integer>>();
        int target = 0;
        // avoid spuris case
        if (num.length < 3) {
        	return new ArrayList<ArrayList<Integer>>(res);
        }

        Arrays.sort(num);
        int first = 0;

        while (first < num.length - 2 && num[first] <= target) {
        	if (first != 0 && num[first] == num[first - 1]) {
        		first++;
        		continue;
        	}

        	int second = first + 1;
        	int third = num.length - 1;
        	int need = target - num[first];

        	while (second < third) {
        		if (num[second] + num[third] < need) {
        			second++;
        		} else if (num[second] + num[third] > need) {
        			third--;
        		} else {
        			ArrayList<Integer> pair = new ArrayList<Integer>();
        			pair.add(num[first]);
        			pair.add(num[second]);
        			pair.add(num[third]);
        			res.add(pair);

        			// update
        			second++;
        			third--;
        		}
        	}

        	// update 
        	first++;
        }

        return new ArrayList<ArrayList<Integer>>(res);
    }
}