class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        HashMap<Character,Integer> map = new HashMap<>();
        int max = 0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                char ch = s.charAt(j);
                if(!map.containsKey(ch)){
                    map.put(ch,1);
                    max = Math.max(max,j-i+1);
                }else{
                    map.clear();
                    break;
                };
            }
        }

        return max;
        
    }
}