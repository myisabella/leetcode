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
    public ListNode reverseBetween(ListNode head, int m, int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ListNode p = head;
        int i = 1;
        
        while (p != null) {
            if (i > (m + (int)((n-m)/2))) {
                return head;    // already pass the half
            }
            
            if (i >= m) { // begin to swap
                ListNode q = p;
                for (int j = 0; j < (n-m-(i-m)*2); j++) {
                    q = q.next;
                }
                
                int temp = p.val;
                p.val = q.val;
                q.val = temp;
            }
            
            // update
            i++;
            p = p.next;
        }
        
        return head;
    }
}