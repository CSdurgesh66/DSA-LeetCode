class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        Map<Character,Character> map = new HashMap<>();
        map.put(')','(');
        map.put('}','{');
        map.put(']','[');

        for(char ch : s.toCharArray()){
            if(map.containsKey(ch)){
                if(st.isEmpty() || st.peek()!=map.get(ch)){
                    return false;
                }
                st.pop();
            }else {
                st.push(ch);
            }
        }
        return st.isEmpty();
    }
}