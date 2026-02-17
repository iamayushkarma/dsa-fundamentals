package Trees.Traversals;

public class TraversalOrder {

    // Helper function
    public static void preOrderTraversal(Node head) {
        if (head == null)
            return;
        System.out.print(head.val + " ");
        preOrderTraversal(head.left);
        preOrderTraversal(head.right);

    }

    public static void inOrderTraversal(Node head) {
        if (head == null)
            return;
        inOrderTraversal(head.left);
        System.out.print(head.val + " ");
        inOrderTraversal(head.right);

    }

    public static void postOrderTraversal(Node head) {
        if (head == null)
            return;
        postOrderTraversal(head.left);
        postOrderTraversal(head.right);
        System.out.print(head.val + " ");

    }

    public static class Node {
        int val;
        Node right;
        Node left;

        Node(int val) {
            this.val = val;
        }
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

        preOrderTraversal(root); // 1 2 4 5 3 6 7
        System.out.println();
        inOrderTraversal(root); // 4 2 5 1 6 3 7
        System.out.println();
        postOrderTraversal(root); // 4 5 2 6 7 3 1
    }

}
