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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode dummy = new ListNode(-1);
        ListNode cur = dummy;
        int car =0;

        while(l1 != null && l2!=null)
        {
            int sum = l1.val + l2.val +car;
            car = sum /10;
            ListNode test = new ListNode(sum%10);
            cur.next = test;
            cur = test;
            l1 = l1.next;
            l2 = l2.next;
        }
        while( l1 != null)
        {
           int sum = l1.val+ car;
           car = sum/10;
           ListNode test = new ListNode(sum%10);
           cur.next = test;
           cur = test;
            l1 = l1.next;
        }
        while( l2 != null)
        {
           int sum = l2.val+ car;
           car = sum/10;
           ListNode test = new ListNode(sum%10);
           cur.next = test;
           cur = test;
            l2 = l2.next;
        } if(car != 0 )
        {
           ListNode test = new ListNode(car);
           cur.next = test;
        }

        return dummy.next;
        
    }
}
