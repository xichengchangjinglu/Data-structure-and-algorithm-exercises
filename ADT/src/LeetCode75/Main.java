package LeetCode75;

public class Main {
    public static void main(String[] args) {
        int[] nums={0,1};
        sortColors(nums);
        for (int i:nums){
            System.out.print(i+" ");
        }
    }

    public static void sortColors(int[] nums) {
        int head=0;
        for (int i=0;i<nums.length;i++){
            if (nums[i]==0){
                int tmp=nums[head];
                nums[head]=nums[i];
                nums[i]=tmp;
                head++;
            }
        }
        for (int i=head;i<nums.length;i++){
            if (nums[i]==1){
                int tmp=nums[head];
                nums[head]=nums[i];
                nums[i]=tmp;
                head++;
            }
        }
    }
}
