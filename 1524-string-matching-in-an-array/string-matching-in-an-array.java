class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> ans = new ArrayList<>();
        int n = words.length;

        for(int i=0;i<n;i++){
            String word = words[i];
            for(int j=0;j<n;j++){
                if(i==j) continue;
                if(words[j].indexOf(word)!= -1){
                    ans.add(words[i]);
                    break;
                }
            }
        }
        return ans;
    }
}