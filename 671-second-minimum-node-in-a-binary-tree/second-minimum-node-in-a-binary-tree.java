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
    long first = Long.MAX_VALUE , second = Long.MAX_VALUE;
     public void findMin(TreeNode root) {
        if (root == null) return;
        if(first>root.val){
            second = first;
            first = root.val;
        }else if(root.val>first && root.val<second){
            second = root.val;
        }
        findMin(root.left);
        findMin(root.right);
     }
    public int findSecondMinimumValue(TreeNode root) {
        if(root==null) return -1;
        findMin(root);
        return (second==Long.MAX_VALUE) ? -1:(int)second;
    }
}