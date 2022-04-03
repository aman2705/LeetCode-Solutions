class Solution {
    public String findLongestWord(String s, List<String> arr) {
        
        String max="";
		// String s="abpcplea";
		// String arr[]= {"a","b","c"};
		for(int i=0;i<arr.size();i++)
		{
			boolean res=anagramcheck(arr.get(i),s);
			if(res==true)
			{
				if(arr.get(i).length()>max.length())
					max=arr.get(i);
                else if(arr.get(i).length()==max.length())
                {
                   PriorityQueue<String> pq=new PriorityQueue<>();
                    pq.add(max);
                    pq.add(arr.get(i));
                    max=pq.poll();
                }
			}
		}
		return max;
    }
    	private static boolean anagramcheck(String s,String t)
	{
		int i=0;
		int j=0;
		while(i< s.length() && j<t.length())
		{
			if(s.charAt(i)==t.charAt(j))
			{
				i++;
				j++;
			}
			else
			{
				j++;
			}
		}
		
		if(i==s.length())
			return true;
		else
			return false;
	}
}