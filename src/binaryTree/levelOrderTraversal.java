package binaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Node{
    int data;
    Node left,right;
    public Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}

public class levelOrderTraversal {

    public static ArrayList<Integer> levelOrder(Node root){
        Queue<Node> que = new LinkedList<>();
        ArrayList<Integer> ans =  new ArrayList<>();
        que.add(root);
        while (!que.isEmpty()){
            Node temp = que.poll();
//            System.out.print(temp.data+" ");
            ans.add(temp.data);
            if (temp.left != null){
                que.add(temp.left);
            }
            if (temp.right != null){
                que.add(temp.right);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
//        System.out.println(root.data);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(6);
        root.right.right =new Node(5);
//        System.out.println(root.data + " " + root.left.data+" "+ root.right.data);
        ArrayList<Integer> ans = levelOrder(root);
        for (int i = 0; i < ans.size(); i++){
            System.out.print(ans.get(i)+" ");
        }

    }
}
