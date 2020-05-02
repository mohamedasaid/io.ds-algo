package LinkList;

public class ListNode {
    public int val;
    // public ListNode prev; // data stored in this node
    public ListNode next; // link to next node in the list

    public ListNode() {

    }

    public ListNode(int val) {
        this.val = val;
        this.next = null;
    }

//    public ListNode(int val, ListNode prev, ListNode next) {
//        this.val = val;
//       // this.prev = prev;
//        this.next = next;
//    }
}
