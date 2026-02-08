class Solution {

    public boolean allZero(int[] freq){
        for(int f:freq){
            if(f!=0) return false;
        }
        return true;
    }
    public boolean checkInclusion(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();
        if(n1>n2) return false;
        int[] freq = new int[26];
        for(char ch:s1.toCharArray()){
            freq[ch-'a']++;
        }

        int l = 0;
        for(int r=0;r<n2;r++){
            freq[s2.charAt(r)-'a']--;

            if(r-l+1>n1){
               freq[s2.charAt(l)-'a']++;
               l++; 
            }
            if(r-l+1==n1 && allZero(freq)){
               return true; 
            }
        }
        return false;
    }
}