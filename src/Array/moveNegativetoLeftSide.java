package Array;

import java.util.Arrays;

public class moveNegativetoLeftSide {

    public static void moveNegativeToLeftSide(int[] arr){
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] +" ");
        }
    }

    public static int[] moveNegativeLeft(int[] arr){
        int start = 0;
        int counter = 0;
        while (counter < arr.length){
            if (arr[counter] < 0){
                int temp = arr[start];
                arr[start] = arr[counter];
                arr[counter] = temp;
                start++;
                counter++;
            }else {
                counter++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {-12, 11, -13, -5, 6, -7, 5, -3, -6,4,2,1,8,3};
        moveNegativeToLeftSide(arr);
        System.out.println();
        int[] lolo = {-12, 11, -13,9,10, -5, 6, -7, 5, -3, -6,4,2,1,8,3};
        int[] ans = moveNegativeLeft(lolo);
        for (int i = 0; i < ans.length; i++){
            System.out.print(ans[i]+" ");
        }
    }
}
