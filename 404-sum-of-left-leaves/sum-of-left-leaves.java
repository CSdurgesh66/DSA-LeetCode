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
    public void findLeftSum(TreeNode root,int[] ans){
        if(root==null) return;
        if(root.left!=null){
           if(root.left.left==null && root.left.right==null){
            ans[0] = ans[0] + root.left.val;
           }
        }
        findLeftSum(root.left,ans);
        findLeftSum(root.right,ans);
    }
    public int sumOfLeftLeaves(TreeNode root) {
        if(root==null) return 0;
        int[] ans = new int[1];
        findLeftSum(root,ans);
        return ans[0];
    }
}