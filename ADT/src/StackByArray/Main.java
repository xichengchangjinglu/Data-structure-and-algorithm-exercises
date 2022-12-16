package StackByArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class StackByArray {
    private int[] stack;
    private int top;

    public StackByArray(int stack_size) {
        stack = new int[stack_size];
        int top = -1;
    }

    public boolean push(int data) {
        if (top >= stack.length) {
            System.out.println("The stack has full");
            return false;
        } else {
            stack[++top] = data;
            return true;
        }
    }

    public boolean empty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public int pop() {
        if (empty()) {
            System.out.println("The stack is empty");
            return -1;
        } else {
            return stack[top--];
        }
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        int stack_size=10;
        int data;
        StackByArray stack=new StackByArray(stack_size);
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter 10 number");
        for (int i=0;i<10;i++){
            data=Integer.parseInt(buf.readLine());
            stack.push(data);
        }
    }
}
