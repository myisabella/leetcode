/**
 * Remove Duplicates from Sorted List II - Given a sorted linked list, 
 * delete all nodes that have duplicate numbers, leaving only distinct
 * numbers from the original list.
 *
 * For example,
 * Given 1->2->3->3->4->4->5, return 1->2->5.
 * Given 1->1->1->2->3, return 2->3.
 *
 * Time Cost: O(N), Space Cost: O(1)
 * Judge Small: 528 ms, Judge Large: 688 ms
 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        // Start typing your Java solution below
        // DO NOT write main() function
        
        // check if list is empty or only one element
        if (head == null || head.next == null) {
        	return head;
        }

        // pre-store head for later return value
        ListNode res = new ListNode(head.val);
        res.next = head;
        head = res;

        // iterative each element in list to find duplicates
        // since the list is sorted, duplicates must be consecutive
        ListNode p = head;
        while (p.next != null) {
        	ListNode pn = p.next;
        	// move to end of duplicate element
        	while (pn.next != null && (pn.next.val == pn.val)) {
        		pn = pn.next;
        	}

        	if (p.next != pn) {
        		p.next = pn.next;
        	} else {
        		p = p.next;
        	}
        }

        return head.next;
    }
}