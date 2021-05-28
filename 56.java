/* [-10,-5,-3,0,5,8,9] 
          0
         / \
        -5  8
        / \  /\
     -10  -3 5 9  
     Height balanced binary tree in which the depth of the two subtrees of every node
     never differ by more than 1.  */
class Solutin42 {
    public class TreeNode {                                         
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) return null;
        return constructTreeFromArray(nums, 0, nums.length-1);
    }

    public TreeNode constructTreeFromArray(int[] nums, int left, int right) {
        if (left > right) return null;
        int midpoint = left + (right-left) / 2;
        TreeNode node = new TreeNode(nums[midpoint]);
        node.left = constructTreeFromArray(nums, left, midpoint-1);
        node.right = constructTreeFromArray(nums, midpoint+1, right);
        return node;
    }
}
