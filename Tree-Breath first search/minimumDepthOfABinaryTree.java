// Find the minimum depth of a binary tree. 
// The minimum depth is the number of nodes along the shortest path 
// from the root node to the nearest leaf node.

import java.util.*;

class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;

  TreeNode(int x) {
    val = x;
  }
};

class MinimumBinaryTreeDepth {
    public static int findDepth(TreeNode root) {
        if (root == null)
            return 0;

    Queue<TreeNode> queue = new LinkedList<>();
    queue.offer(root);
    int minDepth = 0;

    while(!queue.isEmpty()) {
        minDepth++;
        int size = queue.size();
        for (int i = 0; i < size; i++) {
            TreeNode currentNode = queue.poll();
            if (currentNode.left == null && currentNode.right == null) {
                return minDepth;
            }
            if (currentNode.left != null) 
                queue.offer(currentNode.left);
            if (currentNode.right != null) 
                queue.offer(currentNode.right);
        }
    }
    return minDepth;
}

    public static void main(String[] args) {
        TreeNode root = new TreeNode(12);
        root.left = new TreeNode(7);
        root.right = new TreeNode(1);
        root.right.left = new TreeNode(10);
        root.right.right = new TreeNode(5);
        System.out.println("Tree Minimum Depth: " + MinimumBinaryTreeDepth.findDepth(root));
        root.left.left = new TreeNode(9);
        root.right.left.left = new TreeNode(11);
        System.out.println("Tree Minimum Depth: " + MinimumBinaryTreeDepth.findDepth(root));
    }
}
