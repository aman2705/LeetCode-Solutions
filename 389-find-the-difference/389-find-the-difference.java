class Solution {
    public char findTheDifference(String s, String t) {
     
		HashMap<Character,Integer> hm=new HashMap<>();
	    for(int i=0;i<t.length();i++)
        {   
		    hm.put(t.charAt(i),hm.getOrDefault(t.charAt(i),0)+1);
	    }
	    for(int i=0;i<s.length();i++)
	    {
		    if(hm.get(s.charAt(i))==1)
			    hm.remove(s.charAt(i));
		    else if(hm.get(s.charAt(i))>1)
			    hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)-1);
	    }
			for(Character i:hm.keySet())
			{
				if(hm.get(i)==1)
				{
					return i;
				}
			}
        return ' ';
    }
}