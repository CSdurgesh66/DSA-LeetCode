class Solution {
    public int characterReplacement(String s, int k) {      
        int n = s.length();
        int l = 0, r = 0 , maxlen = 0 , maxF = 0;
        int[] hash = new int[26];
        while(r<n){
          char ch = s.charAt(r);
          hash[ch-'A']++;
          maxF = Math.max(maxF,hash[ch-'A']);
          if((r-l+1) - maxF > k){
            hash[s.charAt(l)-'A']--;
            maxF = 0;
            for(int i=0;i<26;i++) maxF = Math.max(maxF,hash[i]);
            l++;
          }
          if((r-l+1)-maxF <=k){
            maxlen = Math.max(maxlen,r-l+1);
          }
           r++; 
        }
         return maxlen;
    }
}