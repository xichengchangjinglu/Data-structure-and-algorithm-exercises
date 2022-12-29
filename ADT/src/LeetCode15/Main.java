package LeetCode15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] nums={-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> lists=new ArrayList<>();
        int length=nums.length;
        if (length<3){
            return lists;
        }
        Arrays.sort(nums);
        for (int i=0;i< nums.length;i++){
            if (nums[i]>0){
                return lists;
            }
            if (i > 0 && nums[i] == nums[i - 1]){
                continue;
            }
            int l=i+1;
            int r=nums.length-1;
            while (l<r){
                int sum=nums[i]+nums[l]+nums[r];
                if (sum==0){
                    lists.add(Arrays.asList(nums[i],nums[l],nums[r]));
                    l++;
                    r--;
                    while (l<r&&nums[l]==nums[l+1]){
                        l++;
                    }
                    while (l<r&&nums[r]==nums[r-1]){
                        r--;
                    }
                }
                else if (sum<0) {
                    l++;
                }
                else {
                    r--;
                }
            }
        }
        return lists;
    }
}
