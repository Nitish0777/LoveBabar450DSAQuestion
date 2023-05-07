package binaryTree;

import java.util.Stack;

public class preOrderTraversal {
    public static void preOrderIterative(Node root) {
        if (root == null){
            return;
        }
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()){
            Node curr = stack.pop();
            System.out.print(curr.data+ " ");
            if (curr.right != null){
                stack.push(curr.right);
            }
            if (curr.left != null){
                stack.push(curr.left);
            }
        }
    }

        public static void preOrderRecursive(Node root){
        if (root == null){
            return;
        }
        System.out.print(root.data+" ");
        preOrderRecursive(root.left);
        preOrderRecursive(root.right);
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
        preOrderRecursive(root);
        System.out.println();
        preOrderIterative(root);
    }
}
