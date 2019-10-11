package Stacks;

/*
 * Implement Stack Data structure using Linked List
 */
public class StackLL {

    private Node head;
    private int size = 0;

    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    StackLL() {
       head = null;
       size = 0;
    }

    void push(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        size++;
    }

    int pop() {
        if(head == null) {
            return Integer.MIN_VALUE;
        }
        size--;
        int d = head.data;
        head = head.next;
        return d;
    }

    int peek() {
        if(head == null) {
            return Integer.MIN_VALUE;
        }
        return head.data;
    }

    boolean isEmpty() {
        return size == 0;
    }

    int size() {
        return size;
    }

    void print() {
        Node curr = head;
        while(curr!=null) {
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
        System.out.println();
    }
}
