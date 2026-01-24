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
    int find(TreeNode root){
        if(root==null) return 0;
        return root.val + find(root.left) + find(root.right);
    }
    public int findTilt(TreeNode root) {
        if(root==null) return 0;
        
        int left = findTilt(root.left);
        int right = findTilt(root.right);
        
        return Math.abs(find(root.left)-find(root.right))+left+right;
    }
}