//Find the largest value on each level of a binary tree.

import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
};

class LevelMaximum {
    public static List<Integer> findLevelMaximums(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        //declare a queue and add root node to queue
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        //iterate the queue till empty
        while (!queue.isEmpty()) {
            Integer maxValue = 0;
            Integer size = queue.size();
            for (int i = 0; i < size; i++) {
                //add each node value to queue
                TreeNode currentNode = queue.poll();
                //compare and get the max value
                maxValue = Math.max(maxValue, currentNode.val);
                //add the children of current node to queue
                if (currentNode.left != null) {
                    queue.offer(currentNode.left);
                }
                if (currentNode.right != null) {
                    queue.offer(currentNode.right);
                }
            }
            //add max value to result list
            result.add(maxValue);      
        }
        return result;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(12);
        root.left = new TreeNode(7);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(9);
        root.left.right = new TreeNode(2);
        root.right.left = new TreeNode(10);
        root.right.right = new TreeNode(5);
        List<Integer> result = LevelMaximum.findLevelMaximums(root);
        System.out.print("Level maximum are: " + result);
    }
}

