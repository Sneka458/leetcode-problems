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
    public boolean isPalindrome(ListNode head) {
        if(head.next==null & head==null) return true;
        ListNode slow=head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode cur=slow,prev=null;
        while(cur!=null){
            ListNode front=cur.next;
            cur.next=prev;
            prev=cur;
            cur=front;
        }
        ListNode first=head,second=prev;
        while(second!=null){
            if(first.val!=second.val) return false;
            first=first.next;
            second=second.next;
        }
        return true;
    }
}