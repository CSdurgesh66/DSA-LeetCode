class Solution {
    public String minWindow(String s, String t) {
        int slen = s.length(), tlen = t.length();
        String ans = "";
        // if(slen==0 || tlen==0) return ans;
        // if((slen==tlen) && s.equals(t)) return t;
        int sIndex = -1;
        int minlen = Integer.MAX_VALUE;
        int cnt = 0;
        int[] hash = new int[256];
        for(int j=0;j<tlen;j++){
            hash[t.charAt(j)]++;
        } 
        int l =0, r = 0;
        while(r<slen){
            char ch = s.charAt(r);
            if(hash[ch]>0) {
                cnt++;
            }
            hash[ch]--;
            while(cnt==tlen){
               if(r-l+1 < minlen){
                  minlen = r-l+1;
                  sIndex = l;
                }
                hash[s.charAt(l)]++;
                if(hash[s.charAt(l)]>0){
                    cnt--;
                }
                l++;
            }
            r++;
        }
        if(sIndex>=0){
            ans = s.substring(sIndex,sIndex+minlen);
        }
        return ans;
    }
}