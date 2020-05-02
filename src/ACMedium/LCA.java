package ACMedium;

import BST.TreeNode;
import ACMedium.BinarySearchTreeTraversal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
   tree =     5
           /     \
          2       7
         / \     / \
        0   3   6    8
             \        \
              4        9
  p = 2
  q = 7 or
  p = 0,
  q = 6
  output = 5
 */

//Given a binary search tree (BST),
// find the lowest common ancestor (LCA) of two given nodes in the BST.

public class LCA {

    public static  TreeNode overAllroot;

    // O(n) time | O(1) where n is the height of the tree
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        while (root != null) {
            if (p.val > root.val && q.val > root.val) {
                // If both p and q are greater than parent
                root = root.right;
            } else if (p.val < root.val && q.val < root.val) {
                // If both p and q are lesser than parent
                root = root.left;
            } else {
                // We have found the split point, i.e. the LCA node.
                return root;
            }
        }
        return null;

    }


    public static  void test() {
        int[] nums = {0, 2, 3, 4, 5, 6, 7, 8, 9};
        // 0, 2, 3, 4, 5, 6, 7, 8, 9

        TreeNode root = TreeNode.createMinimalBST(nums);

        TreeNode p = root.find(2);
        TreeNode q = root.find(7);
        TreeNode lca = lowestCommonAncestor(root, p, q);
        System.out.println(lca.val);

        // Print in order
        System.out.println("Print in Order");
        List<Integer> list = new ArrayList<>();
        BinarySearchTreeTraversal bstInoder = new BinarySearchTreeTraversal();
        bstInoder.inOrderTraverse(root, list);
        System.out.println(list);

    }



    public static void main(String[] args) {


        test();



    }

}
