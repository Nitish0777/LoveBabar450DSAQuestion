package Array;

public class kadens {
    public static long maxSubarraySum(int arr[], int n){
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
            max = Math.max(max,sum);
            if(sum < 0){
                sum = 0;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int N = 5;
        int Arr[] = {1,2,3,-2,5};
        long ans = maxSubarraySum(Arr,N);
        System.out.println(ans);
    }
}
