class Solution {
    public String removeOParentheses(String newstr){
        return newstr.substring(1,newstr.length()-1);
    }
    public String removeOuterParentheses(String s) {
        int n = s.length();
        if(n==0) return "";
        String newstr = "";
        Stack<Character> st = new Stack<>();
        st.add(s.charAt(0));
        newstr += s.charAt(0); 
        String ans = "";
        for(int i=1;i<n;i++){
            char ch = s.charAt(i);
            if(st.isEmpty()){
                ans += removeOParentheses(newstr);
                st.push(ch);
                newstr = "";
            }else if(!st.isEmpty() && ch==')'){
                st.pop();
            }else {
                st.push(ch);
            }
            newstr += ch;
        } 
        ans += removeOParentheses(newstr);
        return ans;
    }
}