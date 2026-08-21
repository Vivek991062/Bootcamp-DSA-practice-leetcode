class Solution {
    public ListNode removeNodes(ListNode head) {

        // 1. Reverse
        head = reverse(head);

        // 2. Traverse and remove
        int max = 0;
        ListNode curr = head;
        ListNode prev = null;

        while (curr != null) {

            if (curr.val < max) {
                prev.next = curr.next;
            } else {
                max = curr.val;
                prev = curr;
            }

            curr = curr.next;
        }

        // 3. Reverse again
        return reverse(head);
    }

    private ListNode reverse(ListNode head) {

        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {

            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
}