import java.util.*;
// check completeness of a Binary tree.(with level-order traversal)
class Solutin5 {
    public boolean isCompleteTree(TreeNode root) {
        boolean end = false; // this will tarck whether we have seen a null node and hit the end of the tree
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()) {
            TreeNode current_node = queue.poll();
            if (current_node == null) {
                    end = true;
            } else {
                if (end) return false;
                queue.offer(current_node.left);
                queue.offer(current_node.right);
            }
        }
        return true;
    }
    public class TreeNode {                                         
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    
    }
}

//Time complexcity: O(N) N is the number of nodes.