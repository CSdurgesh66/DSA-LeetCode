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
    public TreeNode recoverFromPreorder(String s) {
        Stack<TreeNode> st = new Stack<>();
        int i = 0 , n = s.length(); 
        while(i<n){
            int depth = 0;
            while(i<n && s.charAt(i) == '-'){
                depth++;
                i++;
            }

            int value = 0;
            while(i<n && Character.isDigit(s.charAt(i))){
                value = value * 10 + (s.charAt(i) - '0');
                i++;
            }

            TreeNode node = new TreeNode(value);
            while(st.size() > depth){
                st.pop();
            }

            if(!st.isEmpty()){
                TreeNode parent = st.peek();
                if(parent.left==null){
                    parent.left = node;
                }else{
                    parent.right = node;
                }
            }
            st.push(node);
        }

        return st.firstElement();
    }
}