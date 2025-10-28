class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> ans = new ArrayList<>();
        String combined = String.join("#",words) + "#";

        for(String word:words){
            int first = combined.indexOf(word);
            int last = combined.lastIndexOf(word);
            if(first!=last){
                ans.add(word);
            }
        }
        return ans;
    }
}