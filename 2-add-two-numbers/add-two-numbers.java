class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        // Dummy node to store result
        ListNode dummy = new ListNode(0);

        // Pointer to build result list
        ListNode current = dummy;

        // Carry for addition
        int carry = 0;

        // Traverse both lists
        while (l1 != null || l2 != null || carry != 0) {

            int sum = carry; // start with carry

            // Add l1 value if exists
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next; // move forward
            }

            // Add l2 value if exists
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next; // move forward
            }

            // Update carry
            carry = sum / 10;

            // Create new node with remainder
            current.next = new ListNode(sum % 10);

            // Move current pointer
            current = current.next;
        }

        // Return result (skip dummy node)
        return dummy.next;
    }
}