package ACHard;

import LinkList.ListNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Merge two sorted linked lists and return it as a new list.
The new list should be made by splicing together the nodes of the first two lists.
Input: 1->2->4, 1->3->4
Output: 1->1->2->3->4->4

 */

public class MergeTwoLists {

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode p1 = l1;
        ListNode p2 = l2;
        ListNode prev = null;

        if (l1 == null) return l2;
        if (l2 == null) return l1;

        while (p1 != null && p2 != null) {
            if (p1.val < p2.val) {
                prev = p1;
                p1 = p1.next;
            } else {
                if (prev != null) prev.next = p2;
                prev = p2;
                p2 = p2.next;
                prev.next = p1;
            }
        }

        if (p1 == null) prev.next = p2;

        return l1.val < l2.val ? l1 : l2;


    }

    public static ListNode addMany(ListNode l1, List<Integer> values) {
        ListNode curr = l1;
        while (curr.next != null) {
            curr = curr.next;
        }

        for (int val : values) {
            curr.next = new ListNode(val);
            curr = curr.next;
        }
        return l1;
    }

    public static List<Integer> getNodesInArray(ListNode l1) {
        List<Integer> nodes = new ArrayList<>();
        ListNode curr = l1;
        while (curr != null) {
            nodes.add(curr.val);
            curr = curr.next;
        }
        return nodes;
    }


    public static void test() {
        ListNode l1 = new ListNode(1);
        addMany(l1, new ArrayList<>(Arrays.asList(2, 3, 4, 5)));

        ListNode l2 = new ListNode(6);
        addMany(l2, new ArrayList<>(Arrays.asList(7, 8, 9, 10)));

        ListNode output = mergeTwoLists(l1, l2);
        List<Integer> expectedNode = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        if (!getNodesInArray((ListNode) output).equals(expectedNode)) {
            System.out.println("Not equeals");
        } else {
            System.out.println("Equals");
        }


    }


    public static void main(String[] args) {
        test();
    }


}
