package com.arsh.assignments.Assignment4;

import java.util.Scanner;

public class Q1 {
    static final int SIZE = 5;
    int[] stack = new int[SIZE];
    int top;

    Q1(){
        top = -1;
    }

    public boolean isEmpty(){
        if(top==-1)
            return true;
        else
            return false;
    }

    public boolean isFull(){
        if(top>=SIZE-1)
            return true;
        else return false;
    }

    public boolean push(int num){
        if (isFull()){
            System.out.println("\nNo Elements can be added to the stack. Stack Overflow");
            return false;
        }else{
        stack[++top] = num;
        System.out.println(num+" is pushed to the stack");
        return true;
        }
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("\nStack Underflow!!! Insert elements to delete");
            return 0;
        }else {
            int num = stack[top--];
            return num;
        }
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("\nStack Underflow!!! Insert elements to peek");
            return 0;
        }
        else {
            int num = stack[top];
            return num;
        }
    }

    public static void main(String[] args) {
        Q1 s = new Q1();

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Adding to the stack");
        System.out.println("2. Deletion");
        System.out.println("3. Peek");
        System.out.println("4. Display");
        System.out.println("5. Exit");


//
//        System.out.println();
//        s.push(10);
//        s.push(20);
//        s.push(30);
//        s.push(40);
//        s.push(50);
        while (true) {
            System.out.print("Enter your choice (1-5): ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("\nAdding to the stack");
                    System.out.println("Enter number: ");
                    int num = sc.nextInt();
                    s.push(num);
                    System.out.println(num + " was pushed");
                    break;

                case 2:
                    System.out.println("\nDeletion");
                    System.out.println(s.pop() + " was popped");
                    break;

                case 3:
                    System.out.println("\nPeeking");
                    System.out.println(s.peek() + " is the top most element of the stack");
                    break;

                case 4:
                    s.display();
                    break;

                case 5:
                    System.out.println("Thank you visiting. DO come back");
                    return;

                default:
                    System.out.println("Choose a correct choice");

            }

//            System.out.println("\nElement " + s.pop() + " is deleted from the stack");
//            System.out.println("Current Element is: " + s.peek());
        }
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return;
        }else{
            System.out.println("Stack Elements: ");
            for (int i = top; i >=0 ; i--) {
                System.out.println(stack[i]);
            }
        }
    }
}
