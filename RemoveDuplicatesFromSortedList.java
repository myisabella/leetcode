/**
 * Remove Duplicates from Sorted List - Given a sorted linked list, delete all
 * duplicates such that each element appear only once
 *
 * For example,
 * Given 1->1->2, return 1->2.
 * Given 1->1->2->3->3, return 1->2->3.
 *
 * Time Cost: O(N), Space Cost: O(1)
 * Judge Small: 440 ms, Judge Large: 676 ms
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
        ListNode res = head;

        // iterative each element in list to find duplicates
        // since the list is sorted, duplicates must be consecutive
        while (head.next != null) {
        	if (head.next.val == head.val) {
        		head.next = head.next.next;
        	} else {
        		head = head.next;
        	}
        }

        return res;
    }
}