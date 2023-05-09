package binaryTree;

import java.util.ArrayList;
import java.util.Arrays;

public class leftView {

    public static ArrayList<Integer> leftView(Node root){
        ArrayList<Integer> ans = new ArrayList<>();
        int[] arr = new int[4];
        Arrays.fill(arr,-1);



        return ans;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        ArrayList<Integer> ans = leftView(root);
        for (int i:ans) {
            System.out.print(i+" ");
        }
    }
}
