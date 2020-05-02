package ACEasy;

/*
   tree =    10
           /    \
          5      15
         / \     / \
        2   5   13  22
       /          \
      1            14
  target = 12
  output = 13
 */

// Write a function that takes in a Binary Search Tree
// Giving target value return closes tree.data that's closest to target

import BST.TreeNode;

public class FindClosestValueBST {
    public static TreeNode overallRoot;

    public FindClosestValueBST() {
        overallRoot = null;
    }


    public static void add(int value) {
        overallRoot = add(overallRoot, value);
    }

    // value is added to given binary search tree
    private static TreeNode add(TreeNode root, int value) {
        if (root == null) {
            root = new TreeNode(value);
        } else if (value <= root.val) {
            root.left = add(root.left, value);
        } else {
            root.right = add(root.right, value);
        }
        return root;
    }

    public static int findClosestValueInBst(TreeNode root, int target) {
        // Write your code here.

        return helper(root, target, Double.MAX_VALUE);

    }

    public static int helper(TreeNode root, int target, double closest) {

        TreeNode curr = root;
        while (curr != null) {
            if (Math.abs(target - closest) > Math.abs(target - curr.val)) {
                closest = curr.val;
            }

            if (target < curr.val) {
                curr = curr.left;

            } else if (target > curr.val) {
                curr = curr.right;
            } else {
                break;
            }
        }
        return (int) closest;

    }

    public static void test() {
        int[] nums = {0, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] nums2 = {1, 2, 5, 13, 13, 15, 22};

        TreeNode root = TreeNode.createMinimalBST(nums2);
        int lca = findClosestValueInBst(root,  12);
        System.out.println(lca);

    }



    public static void main(String[] args) {
        test();




    }


}
