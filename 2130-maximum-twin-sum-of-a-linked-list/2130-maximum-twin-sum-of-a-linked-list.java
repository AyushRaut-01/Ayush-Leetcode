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
    public int pairSum(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        slow= reverseList(slow);
        ListNode temp=head;
        int ans = Integer.MIN_VALUE;
        while (slow != null) {
        int curr = slow.val + temp.val;
        ans = Math.max(ans, curr);

        slow = slow.next;
        temp = temp.next;
    }
        return ans;
    }
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode nextNode = curr.next; 
            curr.next = prev;             
            prev = curr;                   
            curr = nextNode;              
        }

        return prev;
    }
}