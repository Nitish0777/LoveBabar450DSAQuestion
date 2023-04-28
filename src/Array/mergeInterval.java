package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class mergeInterval {

    public static int[][] merge(int[][] intervals) {
        List<int[]> res = new ArrayList<>();
        if (intervals.length == 0){
            return res.toArray(new int[0][]);
        }
        //Increasing order
        Arrays.sort(intervals,(a,b) -> Double.compare(a[0],b[0]));
        int start = intervals[0][0];
        int end = intervals[0][1];
        for (int[] i: intervals){
            if (i[0] <= end){
                end = Math.max(end,i[1]);
            }else {
                res.add(new int[]{start,end});
                start = i[0];
                end = i[1];
            }
        }
        res.add(new int[]{start,end});
        return res.toArray(new int[0][]);
    }

    public static int[][] mergeInter(int[][] intervals){
        List<int[]> res = new ArrayList<>();
        if(intervals.length == 0){
            return res.toArray(new int[0][]);
        }

        Arrays.sort(intervals,(a,b) -> Double.compare(a[0],b[0]));

        int start = intervals[0][0];
        int end = intervals[0][1];

        for (int[] i : intervals){
            if (i[0] <= end){
                end = Math.max(end,i[1]);
            }else {
                res.add(new int[]{start,end});
                start = i[0];
                end = i[1];
            }
        }
        res.add(new int[]{start,end});
        return res.toArray(new int[0][]);
    }

    public static void main(String[] args) {
        int[][] intervals = {{1,3},{15,18},{8,10},{2,6}};
        //Decreasing order
        //Arrays.sort(intervals,(a,b) -> Double.compare(b[0],a[0]));
        int[][] ans = mergeInter(intervals);
        int row = ans.length;
        int col = ans[0].length;
        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                System.out.print(ans[i][j]+" ");
            }
        }
    }
}
