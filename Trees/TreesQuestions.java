package Trees;

import java.util.*;

public class TreesQuestions {

    public static class Node {
        int val;
        Node right;
        Node left;

        Node(int val) {
            this.val = val;
        }
    }

    // helper function
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

    static boolean flag = true; // related to Q1
    public static int max; // related to Q3

    public static int level(Node root) { // modified for Q1 and Q3 (added extra levels difference check)
        if (root == null)
            return 0;
        int leftLevel = level(root.left);
        int rigthLevel = level(root.right);
        if (Math.abs(leftLevel - rigthLevel) > 1) {
            flag = false;
        }
        max = Math.max(max, (leftLevel + rigthLevel));
        return 1 + Math.max(leftLevel, rigthLevel);
    }

    // > Q1. Balance binary tree
    public static boolean isBinaryTreeBalanced(Node root) {
        flag = true;
        level(root);
        return flag;
    }

    // > Q2 Binary Tree Level Order Traversal
    public static void levelOrderTraversal(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node head = queue.remove();
            System.out.print(head.val + " ");
            if (head.left != null)
                queue.add(head.left);
            if (head.right != null)
                queue.add(head.right);
        }
    }

    // > Q3 Diameter of a Binary Tree
    public static int diameterOfBinaryTree(Node root) {
        max = 0;
        level(root);
        return max;
    }

    // > Q4 Right view of Binary Tree
    public static ArrayList<Integer> RightView(Node root) {
        ArrayList<Integer> list = new ArrayList<>();
        helperForRightView(list, 0, root);
        return list;
    }

    // helper function for Q4
    static void helperForRightView(ArrayList<Integer> list, int level, Node root) {
        if (root == null)
            return;
        if (level >= list.size())
            list.add(root.val);
        else {
            list.set(level, root.val);
        }
        helperForRightView(list, level + 1, root.left);
        helperForRightView(list, level + 1, root.right);
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
        Node g = new Node(8);
        c.left = g;

        // > Q1 Balance binary tree
        Node main = new Node(100);

        Node lSide = new Node(200);
        Node rSide = new Node(300);

        main.left = lSide;
        main.right = rSide;

        Node deep1 = new Node(400);
        Node deep2 = new Node(500);

        lSide.left = deep1;
        deep1.left = deep2;

        System.out.println("Q1 Is binart tree balanced" + isBinaryTreeBalanced(main)); // false

        // > Q2 Binary Tree Level Order Traversal
        System.out.print("Q2 Binary Tree Level Order Traversal: ");
        levelOrderTraversal(root);

        // > Q3 Diameter of a Binary Tree
        System.out.println();
        System.out.println("Q3 Diameter of binary tree is: " + diameterOfBinaryTree(root));

        // > Q4 Right view of Binary Tree
        System.out.println();
        ArrayList<Integer> list = RightView(root);
        System.out.println(list);
    }
}
