class Solution {
    public boolean isIsomorphic(String s, String t) {
        int lens = s.length();
        int lent = s.length();
        if(lens!= lent) return false;
        HashMap<Character,Character> map = new HashMap<>();

        for(int i=0;i<lens;i++){
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);

            if(!map.containsKey(ch1)){
                if(map.containsValue(ch2)) return false;
                else {
                    map.put(ch1,ch2);
                }
            }else {
                 if(map.get(ch1)!=ch2) return false;
            }
        }
        return true;
    }
}