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
    int sum = 0;
    public void helper(TreeNode root,StringBuilder path) {
        if(root==null) return;
        path.append(root.val);
        if(root.left==null && root.right==null){
            int num = Integer.parseInt(path.toString());
            sum += num;
        }
        helper(root.left,path);
        helper(root.right,path);
        path.deleteCharAt(path.length()-1);

    }
    public int sumNumbers(TreeNode root){
        if(root==null) return 0;
        sum = 0;
        helper(root,new StringBuilder());
        return sum;
    }
}