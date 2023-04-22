package Array;

public class revTheArray1 {
    public static String reverseWord(String str){
        StringBuilder ans = new StringBuilder();
        for (int i = str.length()-1; i >= 0; i--){
            ans.append(str.charAt(i));
        }
        return ans.toString();
    }

    public static String rev(String str){
        char[] ans = str.toCharArray();
        int n = ans.length-1;
        for (int i = 0; i <= ans.length/2; i++){
            char temp = ans[i];
            ans[i] = ans[n-i];
            ans[n-i] = temp;
        }
        String aa = ans.toString();
        return aa;
    }

    public static int[] revArray(int[] arr){
        int i = 0;
        int j = arr.length-1;

        while (i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return arr;
    }



    public static void main(String[] args) {
        String str = "Geeks";
        String ans = reverseWord(str);
        System.out.println(ans);
        int[] arr = {1,2,3,4,5,6};
        int[] ans2 = revArray(arr);
        for (int i = 0; i < ans2.length; i++){
            System.out.print(ans2[i] + " ");
        }

//        String ans1 = rev(str);
//        System.out.println(ans1);
    }
}
