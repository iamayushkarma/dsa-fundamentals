package Trees;

import java.util.*;

public class TraversalsInTrees {

    public static class Node {
        int val;
        Node left, right;

        Node(int val) {
            this.val = val;
        }
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

    // Nth level traversal display (will display only nth level)
    public static void printTillNthLevel(Node root, int n) {
        if (root == null)
            return;
        if (n == 1) {
            System.out.print(root.val + " ");
            return;
        }
        printTillNthLevel(root.left, n - 1);
        printTillNthLevel(root.right, n - 1);
    }

    // - Breadth First Search (BFS)
    public static void bfs(Node root) {
        Queue<Node> q = new LinkedList<>();
        if (root != null)
            q.add(root);
        while (!q.isEmpty()) {
            Node temp = q.peek();
            if (temp.left != null)
                q.add(temp.left);
            if (temp.right != null)
                q.add(temp.right);
            System.out.print(temp.val + " ");
            q.remove();
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
        inOrderTraversal(root); // 4 2 5 1 3 6 7
        System.out.println();
        postOrderTraversal(root); // 4 5 2 6 7 3 1
        System.out.println();

        printTillNthLevel(root, 3);
        System.out.println();

        // to print all node level vise
        // int n = 3;
        // for (int i = 1; i <= n; i++) {
        // printTillNthLevel(root, i);
        // }

        // - bfs
        bfs(root);
    }
}
