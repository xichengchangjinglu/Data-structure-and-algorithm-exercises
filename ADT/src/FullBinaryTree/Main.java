package FullBinaryTree;

public class Main {
    public static void main(String[] args) {
        int[] data={6,3,5,9,7,8,4,2};
        int[] btree=new int[16];
        int i,level;

        System.out.println("The original data is");
        for (i=0;i<data.length;i++){
            System.out.print(data[i]+" ");
        }
        System.out.println();

        for (i=0;i<data.length;i++){
            for (level=1;btree[level]!=0;){
                if (data[i]>btree[level]){
                    level=level*2+1;
                }
                else {
                    level=level*2;
                }
            }
            btree[level]=data[i];
        }

        System.out.println("The result is");
        for (i=0;i<btree.length;i++){
            System.out.print(btree[i]+" ");
        }
        System.out.println();
    }
}
