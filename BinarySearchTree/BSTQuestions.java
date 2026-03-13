package BinarySearchTree;

public class BSTQuestions {
    public static class Node {
        int val;
        Node left, right;

        Node(int val) {
            this.val = val;
        }
    }

    public static void inorder(Node root) {
        if (root == null)
            return;

        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    // > Q1 Insert a node in BST
    public static void insertNode(Node node, int key) {

        if (node.val == key)
            return;
        if (node.val < key) {
            if (node.right == null)
                node.right = new Node(key);
            else
                insertNode(node.right, key);
        } else {
            if (node.left == null)
                node.left = new Node(key);
            else
                insertNode(node.left, key);
        }

    }

    public static void main(String[] args) {

        Node root = new Node(8);

        Node a = new Node(4);
        Node b = new Node(12);

        root.left = a;
        root.right = b;

        Node c = new Node(2);
        Node d = new Node(6);

        a.left = c;
        a.right = d;

        Node e = new Node(10);
        Node f = new Node(14);

        b.left = e;
        b.right = f;

        Node g = new Node(1);
        Node h = new Node(3);

        c.left = g;
        c.right = h;

        // > Q1 Insert a node in BST
        insertNode(root, 11);
        System.out.print("Q1: Insert Node ");
        inorder(root);
    }
}
