package Trees.Traversals;

import java.util.*;

public class BFS {

    public static class Node {
        int val;
        Node right;
        Node left;

        Node(int val) {
            this.val = val;
        }
    }

    public static class Pair {
        Node root;
        int level;

        Pair(Node root, int level) {
            this.root = root;
            this.level = level;

        }
    }

    static void bsf(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root); // adding root node

        while (!queue.isEmpty()) {
            Node head = queue.remove(); // removing and storing first value in queue
            System.out.print(head.val + " ");

            // adding value of left then right node
            if (head.left != null)
                queue.add(head.left);
            if (head.right != null)
                queue.add(head.right);
        }
        System.out.println();
    }

    static void bsfLevelWise(Node root) {
        Queue<Pair> queue = new LinkedList<>();
        int currentLevel = 0;
        queue.add(new Pair(root, 0)); // adding root node

        while (!queue.isEmpty()) {
            Pair pair = queue.remove();
            Node head = pair.root;
            int level = pair.level;

            if (pair.level != currentLevel) {
                currentLevel++;
                System.out.println();
            }
            System.out.print(head.val + " ");
            if (head.left != null)
                queue.add(new Pair(head.left, level + 1));
            if (head.right != null)
                queue.add(new Pair(head.right, level + 1));
        }
        System.out.println();
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

        bsf(root);
        System.out.println();
        bsfLevelWise(root);
    }

}
