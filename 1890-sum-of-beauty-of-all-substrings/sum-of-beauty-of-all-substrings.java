class Solution {
    public int beautyF(String s){
        int[] hash = new int[26];
        Arrays.fill(hash,-1);
        for(int i=0;i<s.length();i++){
            hash[s.charAt(i)-'a']++;
        }
        int max = 0, min = Integer.MAX_VALUE;
        for(int i=0;i<26;i++){
            if(hash[i]!=-1){
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
            StringBuilder sb = new StringBuilder();
            for(int j=i;j<n;j++){
               sb.append(s.charAt(j));
               int beauty = beautyF(sb.toString());
               total += beauty;
            }
        }
        return total;
    }
}