public class P10InsertionSort {
  public ListNode insertionSortList(ListNode ptr) {
        if (ptr == null || ptr.next == null)
            return ptr;
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = ptr;
        while (ptr != null && ptr.next != null) {
            if (ptr.val > ptr.next.val) {
                ListNode toInsert = ptr.next;
                ListNode toInsertPre = dummyHead;
                while (toInsertPre.next.val < toInsert.val) {
                    toInsertPre = toInsertPre.next;
                }
                ptr.next = toInsert.next;
                toInsert.next = toInsertPre.next;
                toInsertPre.next = toInsert;
            } else {
                ptr = ptr.next;
            }
        }
        return dummyHead.next;
   }
}
