package Trees;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class naryTree {

    Node root;

    // Node defintion
    class Node {
        int data;
        ArrayList<Node>  ar;

        Node(int data) {
            this.data = data;
            Collections.fill(ar,null);
        }
    }
}
