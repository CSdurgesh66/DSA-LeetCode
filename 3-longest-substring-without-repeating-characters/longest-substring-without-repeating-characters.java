class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        HashMap<Character,Integer> lastIdx = new HashMap<>();
        int max = 0;
        int l = 0, r = 0;
        while(r<n){
            char ch = s.charAt(r);
            if(lastIdx.containsKey(ch) && lastIdx.get(ch)>=l){
                l = lastIdx.get(ch) + 1;
            }
            lastIdx.put(ch,r);
            max = Math.max(max, r - l + 1);
            r++;
        }
        return max;  
    }
}