class Solution {
    public List<Integer> pathInZigZagTree(int label) {
        List<Integer> ans = new ArrayList<>();
        int depth = 0;
        int temp = label;
        while(temp > 0){
            depth++;
            temp >>= 1;
        }

        while(label > 0){
            ans.add(label);
            int start = 1 << (depth - 1);
            int end   = (1 << depth) - 1;
            label = (start + end - label)/2; // mirror
            depth--;
        }

        Collections.reverse(ans);
        return ans;

    }
}