class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> map = new HashMap<>();
        HashSet<String> used = new HashSet<>();
        String[] arr = s.trim().split("\\s+");
        int i = 0;
        int n = pattern.length();
        if(n!=arr.length) return false;
        for(String str:arr){
           char ch = pattern.charAt(i);
            if(map.containsKey(ch)){
                if(!str.equals(map.get(ch))){
                    return false;
                }
            }else{
                if(used.contains(str)){
                    return false;
                }
                map.put(ch,str);
                used.add(str);
            }
            i++;
        }
        return true;
    }
}