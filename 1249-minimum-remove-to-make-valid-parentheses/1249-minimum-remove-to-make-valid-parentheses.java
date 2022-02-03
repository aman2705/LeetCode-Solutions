class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> st=new Stack<>();
        char c[]=s.toCharArray();
        for(int i=0;i<c.length;i++)
        {
            
            if(c[i]=='(')
            {
                st.push(i);
            }
            else if(c[i]==')')
            {
                if(!st.isEmpty() && st.peek()>=0)
                    st.pop();
                else
                    c[i]='.';
            }
        }
        while(!st.isEmpty())
        {
            c[st.pop()]='.';
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<c.length;i++){
            if(c[i]!='.')
                sb.append(c[i]);
        }
         return sb.toString();
    }
}