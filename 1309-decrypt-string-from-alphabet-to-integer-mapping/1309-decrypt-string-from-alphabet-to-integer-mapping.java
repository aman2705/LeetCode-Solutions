class Solution {
    public String freqAlphabets(String s) {
    
        char ch[]=new char[26];
		ch[0]='a';
		for(int i=1;i<ch.length;i++)
		{
			ch[i]=(char)((char)ch[i-1]+1);	
		}
        int i=0;
        StringBuilder sb=new StringBuilder();
		StringBuilder res=new StringBuilder();
        while(i<s.length())
		{
			char c=' ';
			
			if(i+2<s.length())
			{
				 c=s.charAt(i+2);
			}
			if(c=='#')
			{
				char fi=s.charAt(i);
				char se=s.charAt(i+1);
				sb.append(fi);
				sb.append(se);
				String s1=sb.toString();
				int index=Integer.parseInt(s1)-1;
				res.append(ch[index]);
				sb.delete(0, sb.length());
				i=i+3;
			}
			else
			{
				char fi=s.charAt(i);
				sb.append(fi);
				String s1=sb.toString();
				int index=Integer.parseInt(s1)-1;
				res.append(ch[index]);
				sb.delete(0, sb.length());
				i=i+1;
			}
		}
        return res.toString();
    }
}