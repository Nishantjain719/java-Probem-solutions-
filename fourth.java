// Input: root = [10, 5, 15, 3, 7, null, 18], L = 7, R = 15
// OUTPUT: 32
class Solution4 {
    int range_sum;
    public int rangeSumBST(TreeNode root, int L, int R) {
        range_sum = 0;
        get_range_sum(root, L, R);
        return range_sum;
    }

    public void get_range_sum(TreeNode root, int L, int R) {
        if (root != null) {
            if (root.val >= L && root.val <= R) {
                range_sum += root.val;
            }
             if (root.val > L) {
                 get_range_sum(root.left, L, R);
             }
             if (root.val < R) {
                get_range_sum(root.right, L, R);
            }
        }
    }

    public class TreeNode {                                         
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    
    }
}



