class Solution {
    public String removeOuterParentheses(String s) {
        int n = s.length();
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(char ch:s.toCharArray()){
            if(st.isEmpty()){
                st.push(ch);
            }else if(ch==')' && st.size()==1){
                st.pop();

            }else if(ch=='(' ) {
                st.push(ch);
                sb.append(ch);
            }else {
                st.pop();
                sb.append(ch);
            }
        }

        return sb.toString();
    }
}