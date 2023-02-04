class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        
        
        StringBuilder sb=new StringBuilder();
        ArrayList<Integer> al=new ArrayList<>();
        
        if(p.length()>s.length())
            return al;
        
        for(int i=0;i<p.length();i++)
        {
            sb.append(s.charAt(i));
        }
        
        if(anagramcheck(sb.toString(),p)==true)
            al.add(0);
        
        for(int i=p.length();i<s.length();i++)
        {
            sb.deleteCharAt(0);
            sb.append(s.charAt(i));
             if(anagramcheck(sb.toString(),p)==true)
                    al.add(i-p.length()+1);
        }
        return al;
        
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