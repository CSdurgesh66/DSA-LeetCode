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
    // node value -> subtree height (max)
    Map<Integer, Integer> height = new HashMap<>();

    // node value -> depth form root
    Map<Integer, Integer> depth = new HashMap<>();

    // depth -> [maxHeight, secondMaxHeight]
    Map<Integer, int[]> bestAtDepth = new HashMap<>();

    public int dfs(TreeNode root,int d){
        if(root==null) return -1;

        depth.put(root.val,d);
        int left = dfs(root.left,d+1);
        int right = dfs(root.right,d+1);

        int h = 1 + Math.max(left, right);
        height.put(root.val,h);

        bestAtDepth.putIfAbsent(d,new int[]{-1,-1});
        int[] arr = bestAtDepth.get(d);

        if(h>arr[0]){
            arr[1] = arr[0];
            arr[0] = h;
        }else if (h > arr[1]) {
            arr[1] = h;
        }

        return h;

    }

    public int[] treeQueries(TreeNode root, int[] queries) {
        
        dfs(root, 0);
        int[] ans = new int[queries.length];
        for(int i = 0;i<queries.length;i++){
            int node = queries[i];
            int d = depth.get(node);
            int h = height.get(node);
            int[] arr = bestAtDepth.get(d);
            int remainingHeight = (arr[0] == h) ? arr[1] : arr[0];
            ans[i] = (remainingHeight==-1) ? d-1 : d+remainingHeight;

        }
        return ans;
    }
}