package binaryTree;

import java.util.Stack;

public class postOrderTravelsal {

    public static void postOrderIterative(Node root) {
        if (root == null){
            return;
        }
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        Stack<Integer> out = new Stack<>();
        while (!stack.isEmpty()){
            Node curr = stack.pop();
            out.push(curr.data);
            if (curr.left != null){
                stack.push(curr.left);
            }
            if (curr.right != null){
                stack.push(curr.right);
            }
        }
        while (!out.isEmpty()){
            System.out.print(out.pop()+" ");
        }

    }

        public static void postOrderRecursive(Node root){
        if (root == null){
            return;
        }
        postOrderRecursive(root.left);
        postOrderRecursive(root.right);
        System.out.print(root.data+" ");
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
        postOrderRecursive(root);
        System.out.println();
        postOrderIterative(root);
    }
}
