package UndirectedGraph;

public class Main {
    public static void main(String[] args) {
        int[][] data={{1,2},{2,1},{1,5},{5,1},{2,3},{3,2},{2,4},{4,2},{3,4},{4,3},{3,5},{5,3},{4,5},{5,4}};
        int[][] arr=new int[6][6];
        for (int i=0;i < data.length;i++){
            int x=data[i][0];
            int y=data[i][1];
            arr[x][y]=1;
        }
        System.out.println("Result");
        for (int i=1;i<arr.length;i++){
            for (int j=1;j< arr.length;j++){
                System.out.print("["+arr[i][j]+"] ");
            }
            System.out.println();
        }
    }
}
