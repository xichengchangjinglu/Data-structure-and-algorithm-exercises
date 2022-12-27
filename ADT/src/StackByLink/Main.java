package StackByLink;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        this.next=null;
    }
}

class StackByLink{
    Node front,rear;

    public boolean isEmpty(){
        return front==null;
    }

    public void output_of_stack(){
        Node current=front;
        System.out.println("========");
        while (current!=null){
            System.out.println(current.data);
            current=current.next;
        }
        System.out.println("========");
    }

    public void push(int data){
        Node newNode=new Node(data);
        if (this.isEmpty()){
            front=newNode;
            rear=newNode;
        }
        else {
            rear.next=newNode;
            rear=newNode;
        }
    }

    public void pop(){
        Node newNode;
        if (this.isEmpty()){
            System.out.println("The stack is empty");
            return;
        }
        newNode=front;
        if (newNode==rear){
            front=null;
            rear=null;
            System.out.println("The stack has been empty");
        }
        else {
            while (newNode.next!=rear){
                newNode=newNode.next;
            }
            newNode.next=null;
            rear=newNode;
        }
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        StackByLink stack=new StackByLink();
        int choice=0;
        while (true){
            System.out.println("0:quit 1:push 2:pop");
            choice=Integer.parseInt(buf.readLine());
            switch (choice){
                case 0:
                    break;
                case 1:
                    System.out.println("Please enter your data");
                    int data=Integer.parseInt(buf.readLine());
                    stack.push(data);
                    break;
                case 2:
                    stack.pop();
                    break;
            }
        }
    }
}
