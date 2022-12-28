package LeetCode136;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        int[] nums={4,1,2,1,2};
        System.out.println(singleNumber(nums));
    }

    public static int singleNumber(int[] nums) {
        HashSet<Integer> hashSet=new HashSet<Integer>();
        for (int i=0;i<nums.length;i++){
            if (hashSet.contains(nums[i])){
                hashSet.remove(nums[i]);
            }
            else {
                hashSet.add(nums[i]);
            }
        }
        return hashSet.iterator().next();
    }
}
