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

    // > helper functions
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

    // helper function for Q6
    static void addNodeToList(ArrayList<Node> list, Node root) {
        if (root == null)
            return;
        list.add(root);
        addNodeToList(list, root.left);
        addNodeToList(list, root.right);
    }

    // -----------------------------------------

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

    // > Q5 Lowest Common Ancestor of Binary Tree
    public static Node LowestCommenAncestor(Node root, Node p, Node q) {
        if (root == null)
            return null;
        if (root == p || root == q)
            return root;
        // search left and right subtree
        Node left = LowestCommenAncestor(root.left, p, q);
        Node right = LowestCommenAncestor(root.right, p, q);

        if (left != null && right != null)
            return root;
        return (left != null) ? left : right;
    }

    // > Q6 Flatten Binary Tree to Linked List

    public static ArrayList<Node> flattenBinaryTree(Node root) {
        ArrayList<Node> list = new ArrayList<>();
        addNodeToList(list, root);
        for (int i = 0; i < list.size() - 1; i++) {
            Node a = list.get(i);
            Node b = list.get(i + 1);

            a.right = b;
            a.left = null;
        }
        Node lastNode = list.get(list.size() - 1);
        lastNode.left = null;
        lastNode.right = null;

        return list;
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
        System.out.print("Q4 Right view of Binary Tree: ");
        ArrayList<Integer> list = RightView(root);
        System.out.println(list);

        // > Q5 Lowest Common Ancestor of Binary Tree
        System.out.print("Lowest Common Ancestor of Binary Tree: ");
        Node res = (LowestCommenAncestor(root, c, f));
        System.out.println(res.val);

        // > Q6 Flatten Binary Tree to Linked List
        ArrayList<Node> list6 = flattenBinaryTree(root);
        System.out.print("Binary Tree to Linked List: ");
        for (Node n : list6) {
            System.out.print(n.val + " -> ");
        }

    }
}
