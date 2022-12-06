// Given a binary tree, populate an array to represent its level-by-level traversal. 
// You should populate the values of all nodes of each level from left to right in separate sub-arrays.

import java.util.*;

class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;

  TreeNode(int x) {
    val = x;
  }
};

class LevelOrderTraversal {
    public static List<List<Integer>> traverse(TreeNode root) {
    List<List<Integer>> result = new ArrayList<List<Integer>>();
    if (root == null)
        return result;
    //since we need to traverse all nodes of each level before moving
    //onto the next level, we can use BFS technique to solve this problem. 
    
    //use Queue to traverse in BFS fashion
    Queue<TreeNode> queue = new LinkedList<>();
    //start by pushing the root 
    queue.offer(root);
    //keep iterating until the queue is empty
    while (!queue.isEmpty()) {
        //in reach iteration, first count the elements in the queue
        int levelSize = queue.size();
        List<Integer> currentLevel = new ArrayList<>(levelSize);
        for (int i = 0; i < levelSize; i++) {
            //add the node to the current level
            TreeNode currentNode = queue.poll();  
            currentLevel.add(currentNode.val);
            //insert the children of current node in the queue
            if (currentNode.left != null)
            queue.offer(currentNode.left);
            if (currentNode.right != null)
            queue.offer(currentNode.right);
        }
        result.add(currentLevel);
      }
    return result;
  }

  public static void main(String[] args) {
    TreeNode root = new TreeNode(12);
    root.left = new TreeNode(7);
    root.right = new TreeNode(1);
    root.left.left = new TreeNode(9);
    root.right.left = new TreeNode(10);
    root.right.right = new TreeNode(5);
    List<List<Integer>> result = LevelOrderTraversal.traverse(root);
    System.out.println("Level order traversal: " + result);
  }
}

//   The time complexity of the above algorithm is O(N), where ‘N’ is the total number of nodes in the tree. 
//   This is due to the fact that we traverse each node once.

// The space complexity of the above algorithm will be O(N)
// as we need to return a list containing the level order traversal. 
// We will also need O(N) space for the queue. 
// Since we can have a maximum of N/2 nodes at any level (this could happen only at the lowest level), 
// therefore we will need O(N) space to store them in the queue.