package BinaryTree;

public class RecPostOrder {
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
    public void postOrder(TreeNode root){
        if(root == null){
            return;
        }

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");

    }

    public static void main(String[] args) {
        RecPostOrder bt  = new RecPostOrder();
        bt.createBinaryTree();
        bt.postOrder(bt.root);

    }
}
