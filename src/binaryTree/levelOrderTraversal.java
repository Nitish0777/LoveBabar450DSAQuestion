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
            System.out.print(temp.data+" ");
            ans.add(temp.data);
            if (root.left != null){
                que.add(temp.left);
            }
            if (root.right != null){
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
//        System.out.println(root.data + " " + root.left.data+" "+ root.right.data);
        ArrayList<Integer> ans = levelOrder(root);

    }
}
