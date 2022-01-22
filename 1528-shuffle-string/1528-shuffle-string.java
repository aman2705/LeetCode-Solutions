class Solution {
    public String restoreString(String s, int[] indices) {
        
        char c[]=s.toCharArray();
       
        char ans[]=new char[c.length];
        for(int i=0;i<c.length;i++)
        {
            char ch=c[i];
            int index=indices[i];
            ans[index]=ch;
        }
        String a=new String(ans);
        return a;
    }
}