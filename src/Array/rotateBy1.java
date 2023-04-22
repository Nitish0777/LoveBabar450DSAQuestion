package Array;

public class rotateBy1 {

    public static void rotate(int arr[], int d)
    {
        int n = arr.length;
        int[] ref = new int[d];
        for(int i = 0; i < d; i++){
            ref[i++] = arr[i];
        }
        for(int i = 0; i < n; i++){
            arr[i] = arr[i+1];
        }
        int len = (n-d);

        for(int i = 0; i < ref.length; i++){
            arr[i] = ref[i];
        }
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int A[] = {1, 2, 3, 4, 5};
        rotate(A, 2);
    }
}
