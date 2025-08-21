package problems.sorting.comparision;

import tymex.itw.NodeList.ListNode;

public class Solution {
    public ListNode insertionSortList(ListNode head) {
        ListNode dummy = new ListNode(); // dummy node as the new head
        ListNode curr = head;

        while (curr != null) {
            System.out.println("Current node to insert: " + curr.val);

            // Find the position to insert
            ListNode prev = dummy;
            while (prev.next != null && prev.next.val <= curr.val) {
                prev = prev.next;
            }
            if (prev == dummy) {
                System.out.println(" → Insert at the beginning");
            } else {
                System.out.println(" → Insert after node: " + prev.val);
            }

            // Save next node before re-linking
            ListNode next = curr.next;

            // Insert current into sorted list
            curr.next = prev.next;
            prev.next = curr;

            // Print current state of sorted list
            printList(dummy.next);

            // Move to next node
            curr = next;
        }

        return dummy.next;
    }

    // Helper method to print the current list
    private void printList(ListNode head) {
        System.out.print("Sorted list now: ");
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null\n");
    }
}
