class Solution {
    public int beautyF(int[] hash){
        int max = 0, min = Integer.MAX_VALUE;
        for(int i=0;i<26;i++){
            if(hash[i]>0){
            max = Math.max(max,hash[i]);
            min = Math.min(min,hash[i]);
            }   
        }
        return max-min;
    }
    public int beautySum(String s) {
        int n = s.length();
        int total = 0;
        for(int i=0;i<n;i++){
             int[] hash = new int[26];
            for(int j=i;j<n;j++){
               hash[s.charAt(j)-'a']++;
               int beauty = beautyF(hash);
               total += beauty;
            }
        }
        return total;
    }
}