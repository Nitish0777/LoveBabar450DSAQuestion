package Array;

import java.util.Collections;

public class nextPermutation {

    public static void swap(int[] nums,int i,int j, int k){
        int temp = nums[i];
        nums[i] = nums[k];
        nums[k] = nums[temp];
//        System.out.println(i+" "+j+" "+k);
    }

    public static void nextPermutations(int[] nums) {
        if (nums.length == 0){
            return;
        }
        for (int i = 0; i < nums.length-2; i++){
            int start = nums[0];
            if (start > nums[1] && nums[1] > nums[2]){
                 swap(nums,0,1,2);
            }else {
                if (start < nums[1] && nums[1] < nums[2]){
                    int temp = nums[1];
                    nums[1] = nums[2];
                    nums[2] = temp;
                }
            }
        }

        for (int i =0; i < nums.length; i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] nums = {3,2,1};
        nextPermutations(nums);
    }
}
