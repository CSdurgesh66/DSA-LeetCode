class Solution {
    public int maxDepth(String s) {
        int dep = 0;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                count++;
            }
            dep = Math.max(dep, count);
            if (s.charAt(i) == ')') {
                count--;
            }
        }

        return dep;
    }
}