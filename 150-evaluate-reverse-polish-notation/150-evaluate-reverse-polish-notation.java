class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<tokens.length;i++)
        {
            String s=tokens[i];
            if(s.equals("/")|| s.equals("*")|| s.equals("+")|| s.equals("-"))
               
            {
                int a=st.pop();
                int b=st.pop();
                int c=operation(a,b,s);
                st.push(c);
            }
            else 
            {
                st.push(Integer.parseInt(s));
            }
        }
        return st.peek();
    }
    public static int operation(int a,int b,String s)
    {
        char c=s.charAt(0);
        if(c=='+')
        {
            return a+b;
        }
        else if(c=='-')
        {
            return b-a;
        }
        else if(c=='*')
        {
            return b*a;
        }
        else if(c=='/')
        {
            return b/a;
        }
        return 0;
    }
}