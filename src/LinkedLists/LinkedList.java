package LinkedLists;

public class LinkedList {

    Node head;
    int size;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    LinkedList() {
        head = null;
        size = 0;
    }

    void size() {
        System.out.println("size "+size);
    }

    void add(int data) {
        head = append(head, data);
        size++;
    }

    void addStart(int data) {
        head = prepend(head,data);
        size++;
    }

    void add(int data, int pos) {
        head = insert(head,data,pos);
        size++;
    }

    boolean isEmpty() {
        return size==0;
    }

    void reverse() {
        head = reverseLL(head);
    }

    void delete(int pos) {
        head = del(head, pos);
    }

    void print() {
        Node curr = head;
        System.out.println("**********");
        while(curr != null) {
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
        System.out.println();
        System.out.println("**********");
    }

    private Node del(Node head, int pos) {

        if(pos > size) {
            return head;
        }
        size--;
        if(pos == 0) {
            return head.next;
        }
        Node curr = head;
        while(pos > 1 && curr.next != null) {
            curr = curr.next;
            pos--;
        }
        curr.next = curr.next.next;
        return head;
    }

    private Node reverseLL(Node head) {
        Node prev = null;
        Node next = head;
        while(head != null) {
            next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }

    private Node append(Node head, int data) {

        if(head == null) {
            return new Node(data);
        }
        Node curr = head;
        Node newNode = new Node(data);
        while(curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
        return head;
    }

    private Node prepend(Node head, int data) {

        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        return head;
    }

    private Node insert(Node head, int data, int pos) {

        if(pos > size) {
            return head;
        }
        if(pos == 0) {
            return prepend(head,data);
        }
        Node curr = head;
        Node newNode = new Node(data);
        while(pos > 1 && curr.next != null) {
            curr = curr.next;
            pos--;
        }
        newNode = curr.next;
        curr.next = newNode;
        return head;
    }
}
