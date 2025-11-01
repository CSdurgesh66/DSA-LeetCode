class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> map = new HashMap<>();
        String[] arr = s.trim().split("\\s+");
        int i = 0;
        int n = pattern.length();
        if(n!=arr.length) return false;
        for(String str:arr){
            if(i>=n){
                return true;
            }
            if(map.containsKey(pattern.charAt(i))){
                if(!str.equals(map.get(pattern.charAt(i)))){
                    return false;
                }
            }else{
                if(map.containsValue(str)){
                    return false;
                }
                map.put(pattern.charAt(i),str);
            }
            i++;
        }
        return true;
    }
}