package com.arsh.assignments.Assignment4;

public class Q2 {
    Node head;

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    Q2(){
        this.head = null;
    }

    public boolean isEmpty(){
        if(head==null){
            return true;
        }
        else return false;
    }

    public void push(int data){
        Node new_node = new Node(data);
        new_node.next = head;
        head = new_node;

    }

    public void pop(){
        Node temp = head;

        if(isEmpty()){
            System.out.println("Empty");
            return;
        }
        else {
            head = temp.next;
            temp.next = null;
            temp = null;
        }
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Empty");
            return 0;
        }
        return head.data;
    }

    public static void main(String[] args) {
        Q2 s = new Q2();

        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.peek()+ " : Peek element ");
        s.pop();
        //System.out.println(s.pop()+ " : element Popped");
        System.out.println(s.peek()+ " : Peek element ");
        s.pop();
        System.out.println(s.peek()+ " : Peek element ");
        s.pop();
        System.out.println(s.peek()+ " : Peek element ");
    }
}
