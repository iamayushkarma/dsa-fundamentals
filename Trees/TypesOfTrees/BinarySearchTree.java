package Trees.TypesOfTrees;

/*
BINARY SEARCH TREE (BST)

        4
       / \
      2   6
     / \ / \
    1  3 5  7

Rule:
Left subtree values < root
Right subtree values > root
*/

public class BinarySearchTree {

    public static class Node {
        int val;
        Node left, right;

        Node(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {

        Node root = new Node(4);

        root.left = new Node(2);
        root.right = new Node(6);

        root.left.left = new Node(1);
        root.left.right = new Node(3);

        root.right.left = new Node(5);
        root.right.right = new Node(7);
    }
}
