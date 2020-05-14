package ACMedium;


/*
Add Two numbers
Two non-empty linked lists representing two non-negative integers
Digit are stored in reverse order
Add two numbers and return as linklist
Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807
 */

import LinkList.ListNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddTwoNumbers {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode curr = new ListNode(0);
        ListNode list = curr;
        int sum = 0;
        while(l1 != null || l2 != null) {
            if(l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if(l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            int reminder = sum >= 10 ? sum-10 : sum;
            curr.next = new ListNode(reminder);
            sum = sum >= 10 ? 1 : 0;
            curr = curr.next;
        }

        if(sum == 1) {
            curr.next = new ListNode(1);
        }

        return list.next;
    }

    // Adding Values to the linklist
    // This method is for test only
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

    // Helper method get the sum of the two numbers
    // The Method is for test only
    public static List<Integer> getCurrSum(ListNode l1) {
        List<Integer> node = new ArrayList<>();
        ListNode curr = l1;
        while (curr != null) {
            node.add(curr.val);
            curr = curr.next;
        }
        return node;
    }

    public static void main(String[] args) {
        // Input = [2,4,3], [5,6,4]
        // Output = [7,0,8]
        ListNode l1 = new ListNode(2);
        addMany(l1, new ArrayList<>(Arrays.asList( 4, 3)));

        ListNode l2 = new ListNode(5);
        addMany(l2, new ArrayList<>(Arrays.asList( 6, 4)));

        ListNode currSum = addTwoNumbers(l1, l2);
        System.out.println(getCurrSum(currSum));



    }


}
