class Solution {
    public String sortSentence(String s) {
        
       
        StringBuilder sb=new StringBuilder();
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch==' ')
            {
                count++;
            }
        }
        count=count+1;
        String ans[]=new String[count];
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch>='0' && ch<='9'){
                int n=ch-'0'-1;
                ans[n]=sb.toString();
                sb.delete(0,sb.length());
            }
            if(ch>='a' && ch<='z' || ch>='A' && ch<='Z')
            {
                 sb.append(ch);
            }
           
        }
        StringBuilder s1=new StringBuilder(); 
        for(int i=0;i<ans.length-1;i++)
        {
            s1.append(ans[i]+" ");
        }
        s1.append(ans[ans.length-1]);
        
        return s1.toString();
    }
}