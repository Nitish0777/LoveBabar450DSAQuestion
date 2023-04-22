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

    public static int findDuplicateWithoutModifying(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n+1];
        for (int i = 0; i < n; i++){
            arr[nums[i]]++;
            if (arr[nums[i]] > 1){
                return nums[i];
            }
        }
        return n;
    }
    public static void main(String[] args) {
        int[] nums = {1,3,4,2,2};
        int ans = findDuplicateWithoutModifying(nums);
        System.out.println(ans);
    }
}
