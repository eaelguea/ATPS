public class P10InsertionSort {
  public ListNode insertionSort(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode l1 = new ListNode(0);
        l1.next = head;
        while (head != null && head.next != null) {
            if (head.val > head.next.val) {
                ListNode curr = head.next;
                ListNode prev = l1;
                while (prev.next.val < curr.val) {
                    prev = prev.next;
                }
                head.next = curr.next;
                curr.next = prev.next;
                prev.next = curr;
            } else {
                head = head.next;
            }
        }
        return l1.next;
   }
}
