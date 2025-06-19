class Solution {
    //Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    
    // Solution
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode nextTemp = curr.next; // 儲存下一個節點
            curr.next = prev; // 反轉指標
            prev = curr; // 移動 prev 向前
            curr = nextTemp;
        }

        return prev;
    }
}