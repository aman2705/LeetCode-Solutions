class Solution {
    public List<Integer> powerfulIntegers(int x, int y, int bound) {
        int res=1;
        int countx=0;
		int county=0;
		
		if(x==1)
		{
			countx=countx/10;
		}
		else
		{
			while(bound>=res)
			{
				res=res*x;
				countx++;
			}
		}
		
		res=1;
		if(y==1)
		{
			county=bound/10;
		}
		else
		{
			while(bound>=res)
			{
				res=res*y;
				county++;
			}
		}
		// System.out.println(countx);
		// System.out.println(county);
		ArrayList<Integer> al=new ArrayList<>();
        HashSet<Integer> hm=new HashSet<>();
		for(int i=0;i<=countx;i++)
		{
			for(int j=0;j<=county;j++)
			{
				if(Math.pow(x, i)+Math.pow(y, j)<=bound)
				{
					int res1=((int) (Math.pow(x, i)+Math.pow(y, j)));
                    if(hm.contains(res1)==false)
                    {
                        al.add(res1);
                        hm.add(res1);
                    }
				}
			}
		}
            
        return al;
    }
}