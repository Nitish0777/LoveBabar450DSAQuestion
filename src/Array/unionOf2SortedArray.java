package Array;

import java.util.HashSet;
import java.util.Set;

public class unionOf2SortedArray {

    public static int doUnion(int[] a,int n, int[] b,int m){
        Set<Integer> set = new HashSet<>();
        for (int i = 0;i < n; i++){
            set.add(a[i]);
        }
        for (int j = 0;j < m; j++){
            set.add(b[j]);
        }
        return set.size();
    }

//    public static int doUnionOpti(int[] a,int n, int[] b,int m){
//
//    }


    public static void main(String[] args) {
        int[] a = {1,2,3};
        int n = a.length;
        int[] b = {1,2,3,4,5};
        int m = b.length;
        int ans = doUnion(a,n,b,m);
        System.out.println(ans);
    }
}
