class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Initialize the dummy node and current pointer
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        int carry = 0;

        // Traverse both lists
        while (l1 != null || l2 != null) {
            // Get the values from the current nodes or 0 if the list is shorter
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;

            // Calculate the sum and update the carry
            int sum = x + y + carry;
            carry = sum / 10;

            // Create a new node with the sum modulo 10
            current.next = new ListNode(sum % 10);
            current = current.next;

            // Move to the next nodes in the lists
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        // If there is any carry left, add it as a new node
        if (carry > 0) {
            current.next = new ListNode(carry);
        }

        // Return the result list starting from the node after the dummy node
        return dummy.next;
    }
}
