class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        HashMap<Character,Integer> map = new HashMap<>();
        int l = 0 , maxlen = 0;
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(map.containsKey(ch) &&  map.get(ch)>=l){
                l =  map.get(ch)+1;
            }
            map.put(ch,i);
            maxlen = Math.max(maxlen,i-l+1);
        }
        return maxlen;
    }
}