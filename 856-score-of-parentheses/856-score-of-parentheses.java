class Solution {
    public int scoreOfParentheses(String s) {
      
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='(')
            {
                st.push(-1);
            }
            
            if(ch==')')
            {
                if(!st.isEmpty() && st.peek()==-1)
                {
                    st.pop();
                    st.push(1);
                }
                else
                {
                    int score=0;
                    while(!st.isEmpty() && st.peek()!=-1)
                    {
                        score=score+st.pop();
                    }
                    st.pop();
                    st.push(2*score);
                }
               
            }
        }
        int res=0;
        while(!st.isEmpty())
            res=res+st.pop();
        
        return res;
    }
}