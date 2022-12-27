package SelectSort;

public class Main {
    public static void main(String[] args) {
        int[] data={9,7,5,3,4,6};
        show(data);
        selectSort(data);
        show(data);
    }

    static void show(int[] data){
        for (int i=0;i<data.length;i++){
            System.out.print(data[i]+" ");
        }
        System.out.println();
    }

    static void selectSort(int[] data){
        int position;
        int temp;
        for (int i=0;i<data.length-1;i++){
            position=i;
            int min=data[i];
            for (int j=i+1;j< data.length;j++){
                if (data[j]<min){
                    min=data[j];
                    position=j;
                }
            }
            temp=data[i];
            data[i]=data[position];
            data[position]=temp;
        }
    }
}
