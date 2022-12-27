package QueueByArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class QueueByStack{
    public int front=-1,rear=-1;
    public int max=20;
    public int queue[]=new int[max];

    public void add(int data){
        queue[++rear]=data;
        int number=rear-front;
        System.out.println("The total number of data in the current queue is "+number);
    }

    public void delete(){
        if (front==rear){
            System.out.println("The queue has been empty");
            rear=front=-1;
        }
        else {
            front++;
            int number=rear-front;
            System.out.println("The total number of data in the current queue is "+number);
        }
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        QueueByStack queue=new QueueByStack();
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        while (queue.rear< queue.max-1){
            System.out.println("1:add 2:delete 3:quit");
            int choice=Integer.parseInt(buf.readLine());
            switch (choice){
                case 1:
                    System.out.println("Please enter your data");
                    int data=Integer.parseInt(buf.readLine());
                    queue.add(data);
                    break;
                case 2:
                    queue.delete();
                    break;
                case 3:
                    return;
            }
        }
    }
}
