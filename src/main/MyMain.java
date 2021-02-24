package main;

import implementation.MyStack;

public class MyMain {
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push(11);
        stack.push(53);
        stack.push(77);
        stack.push(34);
        stack.push(45);
        stack.push(64);
        System.out.println("Before Deletion Traverse Stack");
        stack.traverse();
        System.out.println("No. of elements in the stack = " + stack.size());
        System.out.println("Deleted element = " + stack.pop());
        System.out.println("First element = " + stack.peek());
        System.out.println("After Deletion Traverse Stack");
        stack.traverse();
        System.out.println("No. of elements in the stack = " + stack.size());
    }
}
