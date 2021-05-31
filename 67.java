// input: root = {1,2,3,4,5,null,6,7,null,null,null,null,8} output: 15
import java.util.LinkedList;
import java.util.Queue;

class Solutin42 {
    public class TreeNode {                                         
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    
    }

    public int deepestLeavesSum(TreeNode root) {

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        int level_sum = 0;

        while (!queue.isEmpty()) {
            level_sum = 0;

            int size = queue.size();
            for (int i=0; i<size; i++) {
                TreeNode current_node = queue.poll();
                level_sum += current_node.val;
                if (current_node.left != null) queue.offer(current_node.left);
                if (current_node.right != null) queue.offer(current_node.right);
            }

        }

        return level_sum;
    }
}
