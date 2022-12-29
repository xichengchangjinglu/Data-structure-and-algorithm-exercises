package LeetCode169;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int[] nums={2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int[] nums) {
        HashMap<Integer,Integer> hashMap= new HashMap<>();
        for (int i=0;i<nums.length;i++){
            if (hashMap.containsKey(nums[i])){
                int value=hashMap.get(nums[i])+1;
                hashMap.put(nums[i],value);
            }
            else {
                hashMap.put(nums[i],1);
            }
        }
        for (Map.Entry<Integer,Integer> entry: hashMap.entrySet()){
            int standard=nums.length/2;
            if (entry.getValue()>standard){
                return entry.getKey();
            }
        }
        return -1;
    }

/*
    public static int majorityElement(int[] nums){
        int cand_num = nums[0], count = 1;
        for (int i = 1; i < nums.length; ++i) {
            if (cand_num == nums[i])
                ++count;
            else if (--count == 0) {
                cand_num = nums[i];
                count = 1;
            }
        }
        return cand_num;
    }
*/
}
