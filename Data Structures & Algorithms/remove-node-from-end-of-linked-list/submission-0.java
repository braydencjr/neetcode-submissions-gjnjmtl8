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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        List<ListNode> numNodes = new ArrayList<>();
        ListNode track = head;
        while(track != null){
            numNodes.add(track);
            track = track.next;
        }

        int removeIndex = numNodes.size() - n;
        if(removeIndex == 0){
            return head.next;
        }

        numNodes.get(removeIndex-1).next = numNodes.get(removeIndex).next;
        return head;


    }
}
//12345
