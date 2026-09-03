/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if(root1 == null && root2 == null) return null;
        int val = 0;
        if(root1!=null) val += root1.val;
        if(root2!=null) val += root2.val; 
        TreeNode root = new TreeNode(val);
        TreeNode left1 = (root1!=null) ? root1.left : null;
        TreeNode left2 = (root2!=null) ? root2.left : null;
        root.left = mergeTrees(left1, left2);
        TreeNode right1 = (root1!=null) ? root1.right : null;
        TreeNode right2 = (root2!=null) ? root2.right : null;
        root.right = mergeTrees(right1, right2);
        return root;
    }
}