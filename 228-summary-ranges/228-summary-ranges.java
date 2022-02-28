class Solution {
    public List<String> summaryRanges(int[] a) {
       
        ArrayList<Integer> al=new ArrayList<>();
		ArrayList<String> res=new ArrayList<>();
         if(a.length==0)
        {
            return res;
        }
		al.add(a[0]);
		for(int i=1;i<a.length;i++) {
			if(a[i]==a[i-1]+1)
			{
				al.add(a[i]);
			}
			else
			{
				if(al.size()==1)
					res.add(al.get(0)+"");
				else
					res.add(al.get(0)+"->"+al.get(al.size()-1));
				
				al.clear();
				al.add(a[i]);
			}
		}
		if(al.size()==1)
			res.add(al.get(0)+"");
		else
			res.add(al.get(0)+"->"+al.get(al.size()-1));
        
        return res;
    }
}