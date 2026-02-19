package Trees;

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

    static boolean flag = true;

    public static int level(Node root) {
        if (root == null)
            return 0;
        int leftLevel = level(root.left);
        int rigthLevel = level(root.right);
        if (Math.abs(leftLevel - rigthLevel) > 1) {
            flag = false;
        }
        return 1 + Math.max(leftLevel, rigthLevel);
    }

    // Q1. Balance binary tree
    public static boolean isBinaryTreeBalanced(Node root) {
        flag = true;
        level(root);
        return flag;
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

        // Q1
        Node main = new Node(100);

        Node lSide = new Node(200);
        Node rSide = new Node(300);

        main.left = lSide;
        main.right = rSide;

        Node deep1 = new Node(400);
        Node deep2 = new Node(500);

        lSide.left = deep1;
        deep1.left = deep2;

        System.out.println(isBinaryTreeBalanced(main)); // false
    }
}
