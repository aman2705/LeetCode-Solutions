class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length())
            return false;
        
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s1.length();i++)
        {
            sb.append(s2.charAt(i));
        }
        if(anagramcheck(s1,sb.toString())==true)
            return true;
        
        for(int i=s1.length();i<s2.length();i++)
        {
            sb.deleteCharAt(0);
            sb.append(s2.charAt(i));
             if(anagramcheck(s1,sb.toString())==true)
                    return true;
        }
        return false;
        
    }
    private static boolean anagramcheck(String a,String b)
	    {
	       	int check[]=new int[26];
	        for(int i=0;i<a.length();i++)
	        {
	            check[a.charAt(i)-'a']++;
	            check[b.charAt(i)-'a']--;
	        }
	        for(int i=0;i<check.length;i++)
	        {
	            if(check[i]>=1 || check[i]<=-1)
	                return false;
	        }
	        return true;
	    }
}