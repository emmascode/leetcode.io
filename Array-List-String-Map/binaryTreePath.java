/**
 * Definition for a binary tree node.
 * */

import java.util.*;

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
}

 
class BinaryTreePaths {
    public static List<String> traverse(TreeNode root) {
        List<String> list = new ArrayList<>();
        if(root != null)    path(root,"",list);
        return list;
    }
    private static void path(TreeNode root, String pth, List<String> list){
        if(root.left == null && root.right == null)     list.add(pth+root.val);
        if(root.left != null)   path(root.left, pth+root.val+"->", list);
        if(root.right != null)   path(root.right, pth+root.val+"->", list);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(5);
        List<String> result = BinaryTreePaths.traverse(root);
        System.out.println("Level order traversal: " + result);
    }
}
