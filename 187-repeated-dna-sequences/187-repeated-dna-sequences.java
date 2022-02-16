class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        ArrayList<String> al=new ArrayList<>();
        if(s.length()<10)
        {
            return al;
        }
        StringBuilder sb=new StringBuilder();
		HashMap<String,Integer> hm=new HashMap<>();
		for(int i=0;i<10;i++)
		{
			sb.append(s.charAt(i));
		}
		hm.put(sb.toString(), hm.getOrDefault(sb.toString(), 0)+1);
		for(int i=1;i<=s.length()-10;i++)
		{
			sb.deleteCharAt(0);
			sb.append(s.charAt(i+9));
			hm.put(sb.toString(), hm.getOrDefault(sb.toString(), 0)+1);
		}
       // ArrayList<String> al=new ArrayList<>();
		for(String i:hm.keySet())
		{
			if(hm.get(i)>1)
			{
                al.add(i);
			}
		}
		
	return al;
    }
}