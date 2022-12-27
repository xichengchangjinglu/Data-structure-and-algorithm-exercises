package TraceRecord;

class Node{
    int x,y;
    Node next;
    public Node(int x,int y){
        this.x=x;
        this.y=y;
        this.next=null;
    }
}

class TraceRecord{
    public Node first;
    public Node last;

    public boolean isEmpty(){
        if (first==null){
            return true;
        }
        else {
            return false;
        }
    }

    public void push(int x,int y){
        Node newNode=new Node(x,y);
        if (this.isEmpty()){
            first=newNode;
            last=newNode;
        }
        else {
            last.next=newNode;
            last=newNode;
        }
    }

    public void pop(){
        Node newNode;
        if (this.isEmpty()){
            System.out.println("The record is empty");
            return;
        }
        newNode=first;
        while (newNode.next!=last){
            newNode=newNode.next;
        }
        newNode.next=null;
        last=newNode;
    }
}

public class Main {
    //Define the maze and its entrances and exits
    public static int ExitX,ExitY;
    public static int MAZE_ROW=10,MAZE_COL=10;
    public static int[][] MAZE=new int[MAZE_ROW][MAZE_COL];

    public static void main(String[] args) {
        TraceRecord trace=new TraceRecord();
        showMaze();
        int x=1,y=1;
        while (x<=MAZE_COL&&y<=MAZE_ROW){
            trace.push(x,y);
            MAZE[x][y]=2;
            if (MAZE[x][y+1]==0){
                y=y+1;
                continue;
            }
            else if (MAZE[x][y-1]==0){
                y=y-1;
                continue;
            }
            else if (MAZE[x-1][y]==0){
                x=x-1;
                continue;
            }
            else if (MAZE[x+1][y]==0){
                x=x-1;
                continue;
            }
            else {
                if (checkExit(x,y,ExitX,ExitY)){
                    System.out.println("escape");
                }
                else {
                    trace.pop();
                    x=trace.last.x;
                    y=trace.last.y;
                    trace.pop();
                }
            }
        }
        showMaze();
    }

    public static boolean checkExit(int x,int y,int exitX,int exitY){
        if (x==exitX&&y==exitY){
            return true;
        }
        else {
            return false;
        }
    }

    public static void showMaze(){
        for (int i=0;i<MAZE_ROW;i++){
            for (int j=0;j<MAZE_COL;j++){
                System.out.print(MAZE[i][j]);
            }
            System.out.println();
        }
    }
}
