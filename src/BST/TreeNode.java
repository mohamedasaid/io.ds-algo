package BST;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int x) {
        this(x, null, null);
    }

    public TreeNode(int x, TreeNode left, TreeNode right) {
        this.val = x;
        this.left = left;
        this.right = right;

    }

    public static void add(int value) {
       add( value);
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

    public TreeNode find(int v) {
        if (v == val) {
            return this;
        } else if (v <= val) {
            return left != null ? left.find(v) : null;
        } else if (v > val) {
            return right != null ? right.find(v) : null;
        }
        return null;
    }

    public static TreeNode createMinimalBST(int[] array) {
        return createMinimalBST(array, 0, array.length - 1);
    }


    private static TreeNode createMinimalBST(int arr[], int start, int end){
        if (end < start) {
            return null;
        }
        int mid = (start + end) / 2;
        TreeNode n = new TreeNode(arr[mid]);
        n.left = createMinimalBST(arr, start, mid - 1);
        n.right = createMinimalBST(arr, mid + 1, end);
        return n;
    }


}
