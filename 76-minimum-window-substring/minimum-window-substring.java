class Solution {
    public String minWindow(String s, String t) {
        int ns = s.length();
        int nt = t.length();
        if(ns<nt) return "";
        HashMap<Character,Integer> tmap = new HashMap<>();
        for(char ch:t.toCharArray()){
            tmap.put(ch,tmap.getOrDefault(ch,0)+1);
        }

         HashMap<Character,Integer> smap = new HashMap<>();
        int min = Integer.MAX_VALUE;
        String ans = "";
        int l=0 , r=0;
        int startIndex = 0;
        int cnt = 0;
        while(r<ns){
            
            char ch = s.charAt(r);
            smap.put(ch,smap.getOrDefault(ch,0)+1);

            if(tmap.containsKey(ch) && smap.get(ch) <= tmap.get(ch)){
                cnt++;
            }

            while(cnt==t.length()){

                if(r-l+1 < min){
                    min = r-l+1;
                    startIndex = l;
                }

                char leftChar = s.charAt(l);
                smap.put(leftChar, smap.get(leftChar) - 1);

                if(tmap.containsKey(leftChar) && smap.get(leftChar) < tmap.get(leftChar)){
                    cnt--;
                }
                l++;

            }
            r++;
        }
        return  min == Integer.MAX_VALUE ? "" : s.substring(startIndex,startIndex+min);
    }
}