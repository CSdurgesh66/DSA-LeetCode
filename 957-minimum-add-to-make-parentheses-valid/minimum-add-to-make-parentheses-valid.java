class Solution {
    public int minAddToMakeValid(String s) {
        int n = s.length();
        int count = 0;
        Stack<Character> st = new Stack<>();
        for(char ch:s.toCharArray()){
            if(!st.isEmpty() && st.peek()=='(' && ch==')'){
                st.pop();
            }else st.push(ch);
        }
        return st.size();
        
    }
}