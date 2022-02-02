class Solution {
    public String removeKdigits(String s, int k) {
        
        if(k==0)
        {
            return s;
        }
        if(s.length()==k)
        {
            return "0";
        }
     
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            while(!st.isEmpty()&& st.peek()>ch && k>0)
            {
                char ch1=st.pop();
                k--;
            }
            st.push(ch);
        }
        while(k>0)
        {
            st.pop();
            k--;
        }
        StringBuilder sb=new StringBuilder();
      
        
        while(!st.isEmpty())
            sb.append(st.pop());
        
        sb.reverse();
        
        
        //remove all the 0 at the head
        while(sb.length()>1 && sb.charAt(0)=='0')
            sb.deleteCharAt(0);
        
        
        return sb.toString();
      
        
    }
}