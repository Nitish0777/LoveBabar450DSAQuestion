package Array;

public class minimizeHeight2 {

    public static int getMinDiff(int[] arr, int n, int k) {
        int diff = 0;
        int largest,smallest=0;
        int l = arr.length-1;
        int min = 0,max = 0;
        for (int i = 0; i < arr.length; i++){
            min = Math.min(min,arr[i]);
            max = Math.max(max,arr[i]);
        }
        smallest = min;
        largest = max;
        smallest+=k;
        largest-=k;
        diff = largest-smallest;

        return diff;
    }


    public static void main(String[] args) {
        int K = 2, N = 4;
        int Arr[] = {1, 5, 8, 10};
        int ans = getMinDiff(Arr,N,K);
        System.out.println(ans);
    }
}
