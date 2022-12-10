import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    };
    
    class BinaryTreeInorderTraversal {
        public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode cur = root;
       
        while(cur!=null || !stack.empty()){
            while(cur!=null){
                stack.add(cur);
                cur = cur.left;
            }
               cur = stack.pop();
               list.add(cur.val);
               cur = cur.right;
        }
            return list;    
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        List<Integer> result = BinaryTreeInorderTraversal.inorderTraversal(root);
        System.out.println("Binary Tree Inorder traversal: " + result);
    }
}
