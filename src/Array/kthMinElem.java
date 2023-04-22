package Array;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class kthMinElem {

    public static int kthSmallest(int[] arr, int l, int r, int k)
    {
        //Your code here
        Arrays.sort(arr);
        if(k > arr.length-1){
            return -1;
        }
//        int len = k;
        System.out.println("Kth element is"+k);
        for (int i : arr){
            System.out.print(i+" ");
        }
        return arr[k-1];
    }

    public static void kthSmallestOpti(int[] arr, int l, int r, int k){

        Set<Integer> s = new TreeSet<>();
        k--;
        for (int i = 0; i < r; i++){
            s.add(arr[i]);
        }
        Iterator<Integer> itr = s.iterator();
        while (k > 0){
            itr.next();
            k--;
        }
        System.out.println(itr.next());
    }

    public static void main(String[] args) {
        int[] arr = {7,10,4,3,20,15};
        int l = 0;
        int r = arr.length;
        int k = 3;
//        int ans = kthSmallest(arr,l,r,k);
        kthSmallestOpti(arr,l,r,k);
//        System.out.println(ans);

    }
}
