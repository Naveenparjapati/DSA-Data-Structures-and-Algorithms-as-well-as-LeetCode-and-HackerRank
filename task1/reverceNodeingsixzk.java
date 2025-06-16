package task1;
//reverce a node in group of size k
class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        next = null;
    }
}

public class reverceNodeingsixzk {

    public static ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k <= 1) {
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prevGroupEnd = dummy;

        while (true) {
            ListNode kthNode = getKthNode(prevGroupEnd, k);
            if (kthNode == null) {
                break;
            }
            ListNode nextGroupStart = kthNode.next;


            ListNode prev = null, curr = prevGroupEnd.next;
            ListNode groupStart = curr;

            for (int i = 0; i < k; i++) {
                ListNode next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }

            prevGroupEnd.next = prev;
            groupStart.next = nextGroupStart;

            prevGroupEnd = groupStart;
        }

        return dummy.next;
    }


    private static ListNode getKthNode(ListNode current, int k) {
        while (current != null && k > 0) {
            current = current.next;
            k--;
        }
        return current;
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // Example usage
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("original list:");
        printList(head);

        int k = 3;
        head = reverseKGroup(head, k);

        System.out.println("reversed " + k + ":");
        printList(head);
    }
}