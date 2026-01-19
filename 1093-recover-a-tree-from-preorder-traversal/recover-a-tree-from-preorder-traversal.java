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

class Pair {
    int value;
    TreeNode Node;

    Pair(int value, TreeNode Node) {
        this.value = value;
        this.Node = Node;
    }
}

class Solution {
    public void buildTree(TreeNode root, String s,int  i) {
        Stack<Pair> st = new Stack<>();
        int count = 0;
        TreeNode curr = root;
        while (i < s.length()) {
            if (s.charAt(i) == '-') {
                count++;
            } else {
                String str = "";
                while (i < s.length() && s.charAt(i) != '-') {
                    str += s.charAt(i);
                    i++;
                }
                i--;
                TreeNode node = new TreeNode(Integer.parseInt(str));
                boolean exist = false;
                for (Pair it : st) {
                    if (it.value == count) {
                        exist = true;
                        break;
                    }
                }
                if (exist == true) {
                    while (st.peek().value != count) {
                        st.pop();
                    }
                    Pair it = st.pop();
                    curr = it.Node;
                    curr.right = node;
                } else {
                    st.push(new Pair(count, curr));
                    curr.left = node;
                }
                count = 0;
                curr = node;
            }
            i++;
        }
    }

    public TreeNode recoverFromPreorder(String traversal) {
        String str = "";
        int i = 0;
        while (i < traversal.length() && traversal.charAt(i) != '-') {
            str += traversal.charAt(i);
            i++;
        }
        TreeNode root = new TreeNode(Integer.parseInt(str));
        buildTree(root, traversal,i);
        return root;
    }
}