class Solution {
    public int calculate(String s) {
        Stack<Integer> st=new Stack<>();
        char sign='+';
        for(int i=0;i<s.length();i++)
        {
            int val=0;
            char ch=s.charAt(i);
            if(Character.isDigit(ch))
            {
                while(i<s.length() && Character.isDigit(s.charAt(i)))
                {
                    val=val*10+(s.charAt(i)-'0');
                    i++;
                }
                i--;
                if(sign=='+')
                {
                    st.push(val);
                }
                else if(sign=='-')
                {
                    st.push(-val);
                }
                else if(sign=='*')
                {
                    int a=st.pop();
                    val=val*a;
                    st.push(val);
                }
                else if(sign=='/')
                {
                    int a=st.pop();
                    val=a/val;
                    st.push(val);
                }
            }
            else if(ch!=' ')
            {
                sign=ch;
            }
        }
        int sum=0;
        while(!st.isEmpty())
        {
            sum=sum+st.pop();
        }
        return sum;
    }
}