package Trees;

public class ImplementationOfTrees {

    public static class Node {
        int val;
        Node left, right;

        Node(int val) {
            this.val = val;
        }
    }

    public static void displayTree(Node root) {
        if (root == null)
            return;
        System.out.print(root.val + " -> ");
        if (root.left != null)
            System.out.print(root.left.val + ", ");
        if (root.right != null)
            System.out.print(root.right.val);
        System.out.println();
        displayTree(root.left);
        displayTree(root.right);
    }

    // pre-order traversal display
    public static void preOrderTraversal(Node root) {
        if (root == null)
            return;
        System.out.print(root.val + " ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    // in-order traversal display
    public static void inOrderTraversal(Node root) {
        if (root == null)
            return;
        inOrderTraversal(root.left);
        System.out.print(root.val + " ");
        inOrderTraversal(root.right);
    }

    // post-order traversal display
    public static void postOrderTraversal(Node root) {
        if (root == null)
            return;
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.val + " ");
    }

    // size
    public static int size(Node root) {
        if (root == null)
            return 0;
        return 1 + size(root.left) + size(root.right);
    }

    // sum of all node
    public static int treeSum(Node root) {
        if (root == null)
            return 0;
        return root.val + treeSum(root.left) + treeSum(root.right);
    }

    // maximum value in tree
    public static int maxNodeValue(Node root) {
        if (root == null)
            return Integer.MIN_VALUE;
        return Math.max(root.val, Math.max(maxNodeValue(root.left), maxNodeValue(root.right)));
    }

    // minimum value in tree
    public static int minNodeValue(Node root) {
        if (root == null)
            return Integer.MAX_VALUE;
        return Math.min(root.val, Math.min(minNodeValue(root.left), minNodeValue(root.right)));
    }

    // height of tree
    public static int height(Node root) {
        if (root == null || (root.left == null && root.right == null))
            return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        root.left = a;
        root.right = b;
        Node c = new Node(4);
        Node d = new Node(5);
        a.left = c;
        a.right = d;
        Node e = new Node(6);
        Node f = new Node(7);
        b.left = e;
        b.right = f;

        displayTree(root);
        // 1 -> 2, 3
        // 2 -> 4, 5
        // 4 ->
        // 5 ->
        // 3 -> 6
        // 6 ->

        preOrderTraversal(root); // 1 2 4 5 3 6 7
        System.out.println();
        inOrderTraversal(root); // 4 2 5 1 3 6 7
        System.out.println();
        postOrderTraversal(root); // 4 5 2 6 7 3 1

        System.out.println();
        System.out.println("Size of tree: " + size(root));
        System.out.println("Sum of all of tree nodes: " + treeSum(root));
        System.out.println("Max value in tree: " + maxNodeValue(root));
        System.out.println("Min value in tree: " + minNodeValue(root));
        System.out.println("Height of tree: " + height(root));
    }

}
