package implementation;

import myinterface.StackADT;

public class MyStack implements StackADT {
    Node top;
    int size;
    public MyStack(){
        top = null;
    }

    @Override
    public void push(int element) {
        Node node = new Node(element);
        node.setNext(top);
        top = node;
        size++;
    }

    @Override
    public int pop() {
        int response = 0;
        if(!isEmpty()){
            response = top.getData();
            top = top.getNext();
            size--;
        }else{
            System.out.println("Stack Underflow");
        }
        return response;
    }

    @Override
    public int peek() {
        int response = 0;
        if(!isEmpty()){
            response = top.getData();
        }else {
            System.out.println("Stack Empty");
        }
        return response;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    public void traverse(){
        Node temp = top;
        while (temp != null){
            System.out.print(temp.getData() + "<--");
            temp = temp.getNext();
        }
        System.out.println("null");
    }
}
