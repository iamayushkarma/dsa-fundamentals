package Trees.TypesOfTrees;

/*
LEFT SKEWED TREE

    1
   /
  2
 /
3
/
4

Each node has only one child.
*/

public class SkewBinaryTree {

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
        root.left.left = new Node(3);
        root.left.left.left = new Node(4);
    }
}
