package binaryTree;

import java.util.Stack;

public class inorderTraversal {

    public static void inorderIterative(Node root){
       if (root == null){
           return;
       }
       Stack<Node> stack = new Stack<>();
       Node curr = root;
       while (!stack.isEmpty() || curr != null){
           if (curr != null){
               stack.push(curr);
               curr = curr.left;
           }else {
               curr = stack.pop();
               System.out.print(curr.data+" ");
               curr = curr.right;
           }
       }
    }



    public static void inorderRecursive(Node root){
        if (root == null){
            return;
        }
        inorderRecursive(root.left);
        System.out.print(root.data+" ");
        inorderRecursive(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.right.left = new Node(5);
        root.right.right = new Node(6);
        root.right.left.left = new Node(7);
        root.right.left.right = new Node(8);
        inorderRecursive(root);
        System.out.println();
        inorderIterative(root);
    }
}
