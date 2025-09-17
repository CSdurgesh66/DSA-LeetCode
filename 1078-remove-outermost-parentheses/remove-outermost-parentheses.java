class Solution {
    public String removeOParentheses(StringBuilder newstr){
        return newstr.substring(1,newstr.length()-1);
    }
    public String removeOuterParentheses(String s) {
        int n = s.length();
        if(n==0) return "";
        StringBuilder newstr = new StringBuilder();
        Stack<Character> st = new Stack<>();
        st.add(s.charAt(0));
        newstr.append(s.charAt(0)); 
        StringBuilder ans = new StringBuilder();
        for(int i=1;i<n;i++){
            char ch = s.charAt(i);
            if(st.isEmpty()){
                ans.append(removeOParentheses(newstr));
                st.push(ch);
                newstr = new StringBuilder();
            }else if(!st.isEmpty() && ch==')'){
                st.pop();
            }else {
                st.push(ch);
            }
            newstr.append(ch);
        } 
         ans.append(removeOParentheses(newstr));
        return ans.toString();
    }
}