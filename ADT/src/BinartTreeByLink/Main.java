package BinartTreeByLink;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.PseudoColumnUsage;

class TreeNode{
    int value;
    TreeNode leftNode;
    TreeNode rightNode;

    public TreeNode(int value) {
        this.value = value;
        this.leftNode = null;
        this.rightNode = null;
    }

}

class BinaryTree{
    public TreeNode rootNode;

    public BinaryTree(int[] data){
        for (int i=0;i< data.length;i++){
            addNode(data[i]);
        }
    }

    void addNode(int value){
        TreeNode currentNode=rootNode;
        if (rootNode==null){
            rootNode=new TreeNode(value);
            return;
        }
        while (true){
            if (value<currentNode.value){
                if (currentNode.leftNode==null){
                    currentNode.leftNode=new TreeNode(value);
                    return;
                }
                else {
                    currentNode=currentNode.leftNode;
                }
            }
            else {
                if (currentNode.rightNode==null){
                    currentNode.rightNode=new TreeNode(value);
                    return;
                }
                else {
                    currentNode=currentNode.rightNode;
                }
            }
        }
    }

    public void InOrder(TreeNode node){
        if (node!=null){
            InOrder(node.leftNode);
            System.out.print(node.value+" ");
            InOrder(node.rightNode);
        }
    }

    public void PreOrder(TreeNode node){
        if (node!=null){
            System.out.print(node.value+" ");
            PreOrder(node.leftNode);
            PreOrder(node.rightNode);
        }
    }

    public void PostOrder(TreeNode node){
        if (node!=null){
            PostOrder(node.leftNode);
            PostOrder(node.rightNode);
            System.out.print(node.value+" ");
        }
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        int dataSize=5;
        int[] data=new int[dataSize];
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter "+data.length+" number");
        for (int i=0;i<data.length;i++){
            data[i]=Integer.parseInt(buf.readLine());
        }
        BinaryTree binaryTree=new BinaryTree(data);
        binaryTree.InOrder(binaryTree.rootNode);
        System.out.println();
        binaryTree.PostOrder(binaryTree.rootNode);
        System.out.println();
        binaryTree.PreOrder(binaryTree.rootNode);
        System.out.println();
    }
}
