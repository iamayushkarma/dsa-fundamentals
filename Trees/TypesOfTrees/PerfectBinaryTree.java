package Trees.TypesOfTrees;

/*
PERFECT BINARY TREE

        1
       / \
      2   3
     / \ / \
    4  5 6  7

Rule:
- All internal nodes have 2 children
- All leaves at same level
*/

public class PerfectBinaryTree {

    public static class Node {
        int val;
        Node left, right;

        Node(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {

        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.left = new Node(6);
        root.right.right = new Node(7);
    }
}
