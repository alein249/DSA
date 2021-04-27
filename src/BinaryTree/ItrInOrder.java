package BinaryTree;

import java.util.Stack;

public class ItrInOrder {
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
    public void inOrder(){
        if(root == null){
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode temp = root;
        while (!stack.isEmpty() || temp != null){
            if(temp != null){
                stack.push(temp);
                temp = temp.left;

            }
            else{
                temp = stack.pop();
                System.out.print(temp.data + " ");
                temp = temp.right;
            }
        }
    }


    public static void main(String[] args) {
        ItrInOrder bt  = new ItrInOrder();
        bt.createBinaryTree();
        bt.inOrder();


    }

}
