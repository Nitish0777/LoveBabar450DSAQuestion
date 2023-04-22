package Array;

public class sort012 {
    public static int[] sort012(int[] arr){
        int start = 0;
        int end = arr.length-1;
        int counter = 0;
        while (counter <= end){
            if (arr[counter] == 0){
                int temp = arr[counter];
                arr[counter] = arr[start];
                arr[start] =temp;
                counter++;
                start++;
            }else if(arr[counter] == 2){
                int temp = arr[counter];
                arr[counter] = arr[end];
                arr[end] =temp;
                end--;
            }else {
                counter++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {0,2,1,2,0};
        int[] ans = sort012(arr);
        for (int i = 0; i < ans.length; i++){
            System.out.println(ans[i]+" ");
        }
    }
}
