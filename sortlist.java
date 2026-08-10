class Solution {
    public ListNode sortList(ListNode head) {

        if (head == null || head.next == null)
            return head;

        // Find middle
        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Split
        ListNode second = slow.next;
        slow.next = null;

        // Sort both parts
        ListNode first = sortList(head);
        second = sortList(second);

        // Merge
        return merge(first, second);
    }

    ListNode merge(ListNode a, ListNode b) {

        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;

        while (a != null && b != null) {

            if (a.val < b.val) {
                temp.next = a;
                a = a.next;
            } else {
                temp.next = b;
                b = b.next;
            }

            temp = temp.next;
        }

        if (a != null)
            temp.next = a;

        if (b != null)
            temp.next = b;

        return dummy.next;
    }
}
        