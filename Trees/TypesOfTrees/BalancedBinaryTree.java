package Trees.TypesOfTrees;

/*
BALANCED BINARY TREE

        1
       / \
      2   3
     /
    4

Height difference <= 1 at every node.
*/

public class BalancedBinaryTree {

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
    }
}
