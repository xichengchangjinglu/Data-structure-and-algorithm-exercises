package Hanoi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        int size=Integer.parseInt(buf.readLine());
        Hanoi(size,1,2,3);
    }

    public static void Hanoi(int size,int p1,int p2,int p3){
        if (size==1){
            System.out.println("from "+p1+" to "+p3);
        }
        else {
            Hanoi(size-1,p1,p3,p2);
            System.out.println("from "+p1+" to "+p3);
            Hanoi(size-1,p2,p1,p3);
        }
    }
}
