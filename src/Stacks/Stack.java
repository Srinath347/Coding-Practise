package Stacks;

public class Stack {

    private int top = -1;
    private int[] arr;

    Stack(int max) {
        arr = new int[max];
    }

    void push(int data) {
        if(top == arr.length) {
            return;
        }
        arr[++top] = data;
    }

    int pop() {
        if(top<0) {
            return Integer.MIN_VALUE;
        }
        return arr[top--];
    }

    int size() {
        return top+1;
    }

    int peek() {
        if(top<0) {
            return Integer.MIN_VALUE;
        }
        return arr[top];
    }

    boolean isEmpty() {
        return top==-1;
    }

    void print() {
        for(int i=top;i>=0;i--) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
