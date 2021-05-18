import java.util.*;




class Solution {
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> largest_vals = new ArrayList<Integer>();                          //  1
        helper_method(root, largest_vals, 0);                                          //  / \
        return largest_vals;                                                      //      3   2
                                                                            //           / \   \
    }                                                                      //           5   3   9 
    public class TreeNode {                                               // output [1, 3, 9] find largest values in each Tree row.
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    
    }
    public void helper_method(TreeNode root, List<Integer> largest_vals, int level) {
        if (root == null) return;
        if (level == largest_vals.size()) {
            largest_vals.add(root.val);
        } else {
            largest_vals.set(level, Math.max(largest_vals.get(level), root.val));
        }
        helper_method(root.left, largest_vals, level+1);
        helper_method(root.right, largest_vals, level+1);
    }
   
}

