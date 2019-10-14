package Trees;

public class TernaryTree {

    Node root;

    // Node definition
    class Node {

        int data;
        Node right;
        Node left;
        Node mid;

        Node(int data) {
            this.data = data;
            this.right = null;
            this.left = null;
            this.mid = null;
        }
    }
}
