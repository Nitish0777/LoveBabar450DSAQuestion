package Array;

import java.util.Arrays;

public class findDuplicateNo {
    public static int findDuplicate(int[] nums) {
//        int count = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-1; i++){
            if (nums[i] == nums[i+1]){
                return nums[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {1,3,4,2,2};
        int ans = findDuplicate(nums);
        System.out.println(ans);
    }
}
