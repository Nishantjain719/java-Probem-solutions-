import java.util.*;

// find bottom left tree value
class Solution2 {
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>(); // FIFO
        queue.offer(root);
        while(!queue.isEmpty()) {
            root = queue.poll(); // dequeue from queue
            if (root.right != null) {
                queue.offer(root.right);
            } 
            if (root.left != null) {
                queue.offer(root.left);
            } 
            
        }

        return root.val;
    }
    
    public class TreeNode {                                         
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    
    }
}