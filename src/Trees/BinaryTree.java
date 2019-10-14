package Trees;

public class BinaryTree {

    Node root;

    // Node definition
    class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left =  null;
            this.right = null;
        }
    }
}
