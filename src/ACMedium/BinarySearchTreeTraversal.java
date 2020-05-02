package ACMedium;
import BST.TreeNode;

import java.util.List;

// O(n) time | O(n) space
public class BinarySearchTreeTraversal {

    public BinarySearchTreeTraversal() {

    }



    public static List<Integer> inOrderTraverse(TreeNode root, List<Integer> list) {
    // Write your code here.
    if (root == null) return list;
    inOrderTraverse(root.left, list);
    list.add(root.val);
    inOrderTraverse(root.right, list);

    return list;
    }

    // O(n) time | O(n) space
    public static List<Integer> preOrderTraverse(TreeNode root, List<Integer> list) {
        // Write your code here.
        if (root == null) return list;
        list.add(root.val);
        preOrderTraverse(root.left, list);
        preOrderTraverse(root.right, list);


        return list;
    }

    // O(n) time | O(n) space
    public static List<Integer> postOrderTraverse(TreeNode root, List<Integer> list) {
        // Write your code here.
        if (root == null) return list;
        postOrderTraverse(root.left, list);
        postOrderTraverse(root.right, list);
        list.add(root.val);


        return list;
    }




}
