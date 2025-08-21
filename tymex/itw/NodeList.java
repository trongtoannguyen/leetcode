package tymex.itw;

public class NodeList {
    // Find the middle node, if there are two ones (If the list has an even number of nodes), return the second.
    // Solution1: implement 2 pointer, slow (moves 1 step at a time) and fast (moves 2 step at a time)
    // Solution 2: using 1 pointer from the first node and count number of nodes (n) until reach end(null) of the list,
    // finally divide the score in half, then traverse and find node in n/2 index.

    public static ListNode findMiddle(ListNode head) {
        if (head == null) return null;

        ListNode slw = head;
        ListNode fst = head;

        while (fst != null && fst.next != null) {
            slw = slw.next;
            fst = fst.next.next;
        }

        return slw;
    }

    public static class ListNode {
        public int val;
        public ListNode next;
        public ListNode() {}
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(val);
            ListNode temp = next;
            while (temp != null) {
                sb.append(" -> ");
                sb.append(temp.val);
                temp = temp.next;
            }
            sb.append(" -> null");
            return sb.toString();
        }
    }
}

