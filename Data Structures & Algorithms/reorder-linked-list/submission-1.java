/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }

        ListNode secHalf = slow.next;
        slow.next = null;
        ListNode prev = null;
        while(secHalf != null){
            ListNode temp = secHalf.next;
            secHalf.next = prev;
            prev = secHalf;
            secHalf = temp;
        }

        ListNode firstHalf = head;
        secHalf = prev;
        while(secHalf != null){
            ListNode tmp1 = firstHalf.next;
            ListNode tmp2 = secHalf.next;
            firstHalf.next = secHalf;
            secHalf.next = tmp1;
            firstHalf = tmp1;
            secHalf = tmp2;
        }   
    }
}
