//Binary Tree Right side view
//Input: [1,2,3,null,5,null, 4] Output: [1,3, 4] explanation: 
import java.util.*;

class Solutin6 {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root == null) return result;
        queue.offer(root);
        while(!queue.isEmpty()) {
            int size = queue.size();
            for(int i=0; i<size; i++) {
TreeNode current_node = queue.poll();
if (i==0) result.add(current_node.val);
if (current_node.right != null) queue.offer(current_node.right);
if (current_node.left != null) queue.offer(current_node.left);
            }
        }
      return  result;
        

    }
    public class TreeNode {                                         
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    
    }
}