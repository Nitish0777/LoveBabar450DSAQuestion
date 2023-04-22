package Array;


import javax.print.attribute.standard.PrinterIsAcceptingJobs;
import java.util.Arrays;
import java.util.Map;

public class maxMinArray2 {

    public static void minMaxElem(int[] arr){
        Arrays.sort(arr);
        int min = arr[0];
        int max = arr[arr.length-1];
        Pair<Integer,Integer> ans  = new Pair<>(min,max);
        System.out.println(ans.getFirst()+" "+ans.getSecond());
    }

    public static void minMaxElementOpti(int[] arr){
        int min = arr[0];
        int max = arr[0];

        for (int i = 0; i < arr.length; i++){
            min = Math.min(min,arr[i]);
            max = Math.max(max,arr[i]);
        }
        System.out.println(min+" "+ max);
    }

    public static void main(String[] args) {
        int[] arr = {2,3,4,1,7,6,8};
        minMaxElem(arr);
        minMaxElementOpti(arr);

//        Pair<String,Integer> pair = new Pair<>("Hello",22);
//        System.out.println(pair.getFirst()+" "+pair.getSecond());
    }
}
