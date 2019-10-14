package Trees;

public class BinarySearchTree {

    Node root;

    class Node {
        int data;
        Node right;
        Node left;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
}
