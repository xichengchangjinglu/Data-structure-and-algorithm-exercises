package GraphLink;

class Node{
    int value;
    Node next;
    public Node(int value){
        this.value=value;
        this.next=null;
    }
}

class GraphLink{
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

    public void print(){
        Node currentNode;
        if (this.isEmpty()){
            System.out.println("The data is empty");
        }
        else {
            currentNode=first;
            while (currentNode!=null){
                System.out.print(currentNode.value+"->");
                currentNode=currentNode.next;
            }
            System.out.print("null");
            System.out.println();
        }
    }

    public void insert(int value){
        Node newNode=new Node(value);
        if (this.isEmpty()){
            first=newNode;
            last=newNode;
        }
        else {
            last.next=newNode;
            last=newNode;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        int[][] data={{1,2},{2,1},{1,5},{5,1},{2,3},{3,2},{2,4},{4,2},{3,4},{4,3},{3,5},{5,3},{4,5},{5,4}};
        GraphLink[] graphLinks=new GraphLink[6];
        for (int i=1;i<6;i++){
            graphLinks[i]=new GraphLink();
            graphLinks[i].insert(i);
            for (int j=0;j<14;j++){
                if (data[j][0]==i){
                    graphLinks[i].insert(data[j][1]);
                }
            }
            graphLinks[i].print();
        }
    }
}
