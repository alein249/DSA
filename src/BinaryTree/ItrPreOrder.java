package BinaryTree;

import java.util.Stack;

public class ItrPreOrder {
    public TreeNode root;
    static class TreeNode{
        int data;
        TreeNode right;
        TreeNode left;
        public TreeNode(int data){
            this.data = data;
        }
    }
    public void createBinaryTree(){
        TreeNode first = new TreeNode(9);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode fourth = new TreeNode(4);


        root = first; //root --> first
        first.left = second;
        first.right = third; // second <-- first --> third

        second.left = fourth;

    }
    public void preOrder(){
        if(root == null){
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()){
            TreeNode temp = stack.pop();
            System.out.print(temp.data + " ");
            if(temp.right != null){
                stack.push(temp.right);
            }
            if(temp.left != null){
                stack.push(temp.left);
            }
        }
    }


    public static void main(String[] args) {
        ItrPreOrder bt  = new ItrPreOrder();
        bt.createBinaryTree();
        bt.preOrder();


    }
}
