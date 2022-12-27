package BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        int[] data={1,3,7,14,24,64,79,92};
        int right=data.length-1;
        int left=0;
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter your search target");
        int target=Integer.parseInt(buf.readLine());
        binarySearch(data,left,right,target);
    }

    public static void binarySearch(int data[],int left,int right,int target){
        //基本条件处理
        int mid=(right-left)/2+left;
        if (data[mid]==target){
            System.out.println("The target position is "+mid);
        }
        //超级操作
        if (data[mid]<target){
            binarySearch(data,mid+1,right,target);
        }
        if (data[mid]>target){
            binarySearch(data,left,mid,target);
        }
        //微操作
        return;
    }
}
