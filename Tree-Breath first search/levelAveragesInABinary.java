//Given a binary tree, populate an array to represent the averages of all of its levels. 

import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
};

class LevelAverage {
    public static List<Double> findLevelAverages(TreeNode root) {
        List<Double> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        //declare a queue and add root node to queue
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        // iterate the queue till empty
        while (!queue.isEmpty()) {
            Double levelSum = 0.0;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                //add each node value to queue
                TreeNode currentNode = queue.poll();
                //add the node's value to the running sum
                levelSum += currentNode.val;
                //add the children of current node to queue
                if (currentNode.left != null) {
                    queue.offer(currentNode.left);
                }
                if (currentNode.right != null) {
                    queue.offer(currentNode.right);
                }
            }
            //add each average to result list
            Double levelAverage = levelSum/size;
            result.add(levelAverage);
            
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
        List<Double> result = LevelAverage.findLevelAverages(root);
        System.out.print("Level averages are: " + result);
  }
}

