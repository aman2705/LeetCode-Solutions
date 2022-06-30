class Solution {
    public int longestValidParentheses(String s) {
        
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            
            char ch=s.charAt(i);
            if(ch=='('){
                st.push(i);
            }
            else{
                if(!st.isEmpty() && s.charAt(st.peek())=='(')
                    st.pop();
                else{
                    st.push(i);
                }
            }
        }
        int maxlen=0;
        int endterminal=s.length();
        int startterminal=0;
        while(!st.isEmpty()){
            
            startterminal=st.pop();
            maxlen=Math.max(maxlen,endterminal-startterminal-1);
            
            endterminal=startterminal;    
        }
        return Math.max(maxlen,endterminal);
    }
}