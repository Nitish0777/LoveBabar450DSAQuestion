package Array;

public class merge2SortedArr {
    public static void merge(long[] arr1, long[] arr2, int n, int m)
    {
        // code here
        int start = 0;
        int start1 = 0;
        for (int i = 0; i < 4; i++){
            if (arr1[start] > arr2[start1]){
                start++;
            }else {
                long temp = arr1[start];
                arr1[start] = arr2[start1];
                arr2[start1] = temp;
                start++;
//                start1++;
            }
        }

        for (int i = 0; i < arr1.length; i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < arr2.length; i++){
            System.out.print(arr2[i]+" ");
        }

    }

    public static void withExtraSpace(long[] arr1, long[] arr2, int n, int m){
        long[] mer = new long[m+n];
        int min = Math.min(n,m);
        int str = 0;
        int ar1 = 0;
        int ar2 = 0;
        while (ar1 < n && ar2 < m){
            if (arr1[ar1] < arr2[ar2]){
                mer[str++] = arr1[ar1++];
            }else {
                mer[str++] = arr2[ar2++];
            }
        }
        while (ar1 < arr1.length){
            mer[str++] = arr1[ar1++];
        }
        while (ar2 < arr2.length){
            mer[str++] = arr2[ar2++];
        }
        for (int i = 0; i < mer.length; i++){
            System.out.print(mer[i] + " ");
        }
    }


    public static void main(String[] args) {
        int n = 4;
        long[] arr1 = {1,3,5,7};
        int m = 5;
        long[] arr2 = {0,2,6,8,9};
        withExtraSpace(arr1,arr2,n,m);
    }
}
