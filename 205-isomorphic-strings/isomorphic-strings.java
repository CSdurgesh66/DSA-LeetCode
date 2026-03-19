class Solution {
    public boolean isIsomorphic(String s, String t) {
       HashMap<Character,Character> smap = new HashMap<>();
       HashMap<Character,Character> tmap = new HashMap<>(); 
       int sn = s.length();
       int tn = t.length();

       if(sn!=tn) return false;

       for(int i=0;i<sn;i++){
        char sch = s.charAt(i);
        char tch = t.charAt(i);
        if(smap.containsKey(sch)){
            char value = smap.get(sch);
            if(value!=tch) return false;
        }
        else if(tmap.containsKey(tch)){
            char value = tmap.get(tch);
             if(value!=sch) return false;
        }else{
            smap.put(sch,tch);
            tmap.put(tch,sch);
        }
       }

       return true;
    }
}