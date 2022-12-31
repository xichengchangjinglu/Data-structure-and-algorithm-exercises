package LeetCode56;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        System.out.println(Arrays.toString(merge(intervals)));
    }

    public static int[][] merge(int[][] intervals) {
        if (intervals.length==0){
            return new int[0][2];
        }
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });
        ArrayList<int[]> result=new ArrayList<>();
        int head=intervals[0][0],tail=intervals[0][1];
        if (intervals.length==1){
            result.add(new int[]{head,tail});
            return result.toArray(new int[][]{});
        }
        for (int i=1;i<intervals.length;i++){
            if (intervals[i][0]>tail){
                result.add(new int[]{head,tail});
                head=intervals[i][0];
                tail=intervals[i][1];
            }
            if (intervals[i][0]<head){
                head=intervals[i][0];
            }
            if (intervals[i][1]>tail){
                tail=intervals[i][1];
            }
        }
        result.add(new int[]{head,tail});
        return result.toArray(new int[result.size()][]);
    }
}
