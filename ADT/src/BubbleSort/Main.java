package BubbleSort;

public class Main {
    public static void main(String[] args) {
        int[] data={6,5,9,7,2,8};
        int temp;

        System.out.println("The previous data is");
        for (int i=0;i<data.length;i++){
            System.out.print(data[i]+" ");
        }
        System.out.println();

        for (int i=data.length-1;i>0;i--){
            for (int j=0;j<data.length-1;j++){
                if (data[j]<data[j+1]){
                    temp=data[j];
                    data[j]=data[j+1];
                    data[j+1]=temp;
                }
            }
        }

        System.out.println("The later data is");
        for (int i=0;i<data.length;i++){
            System.out.print(data[i]+" ");
        }
        System.out.println();
    }
}
