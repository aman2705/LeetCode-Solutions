class Solution {
    public boolean isValid(String s) {
       Stack<Character> st=new Stack<>();
        char c[]=s.toCharArray();
        for(int i=0;i<c.length;i++)
        {
            if(c[i]=='c')
            {
                if(st.isEmpty() || st.pop()!='b')
                    return false;
                if(st.isEmpty() || st.pop()!='a')
                    return false;
            }
            else
            {
                st.push(c[i]);
            }
        }
        return st.isEmpty();
    }
}