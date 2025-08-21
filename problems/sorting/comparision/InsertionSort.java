package problems.sorting.comparision;

import tymex.itw.NodeList;

public class InsertionSort {
    public static void main(String[] args) {
        final int[] arr = {5, 3, 6, 8, 2, 1, 4};
        NodeList.ListNode head = NodeList.ListNode.createNodeList(arr);

        //print list
        System.out.println("Original list: " + head);

        Solution solution = new Solution();
        NodeList.ListNode sortedList = solution.insertionSortList(head);
        System.out.println("Sorted list: " + sortedList);
    }

    static class Solution {
        public NodeList.ListNode insertionSortList(NodeList.ListNode head) {
            NodeList.ListNode dummy = new NodeList.ListNode(); // dummy node as the new head
            System.out.println("Dummy node: " + dummy + "\n");

            NodeList.ListNode curr = head;

            while (curr != null) {
                System.out.println("Current node to insert: " + curr.val);

                // Find the position to insert
                NodeList.ListNode prev = dummy;
                while (prev.next != null && prev.next.val <= curr.val) {
                    prev = prev.next;
                }
                if (prev == dummy) {
                    System.out.println(" → Insert at the beginning");
                } else {
                    System.out.println(" → Insert after node: " + prev.val);
                }

                // Save next node before re-linking
                NodeList.ListNode next = curr.next;

                // Insert current into sorted list
                curr.next = prev.next;
                prev.next = curr;

                // Print current state of sorted list
                System.out.println("Sorted list now: " + dummy + "\n");

                // Move to next node
                curr = next;
            }

            return dummy.next;
        }
    }
}
