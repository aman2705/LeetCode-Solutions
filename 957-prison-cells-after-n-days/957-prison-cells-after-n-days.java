class Solution {
    public int[] prisonAfterNDays(int[] a, int n) {
        
        boolean hascycle=false;
        int cycle=0;
        HashSet<String> hm=new HashSet<>();
        for(int i=0;i<n;i++)
		{
            int temp[]=nextday(a);
            String s=Arrays.toString(temp);
            if(!hm.contains(s))
            {
                hm.add(s);
                cycle++;
            }
            else
            {
                hascycle=true;
                break;
            }
            a=temp;
		}
        if(hascycle==true)
        {
            n=n%cycle;
            for(int i=0;i<n;i++)
            {
                a=nextday(a);
            }
        }
        return a;
    }
    private static int[] nextday(int []cells)
	{
		int temp[]=new int[cells.length];
		for(int i=1;i<cells.length-1;i++)
		{
			if(cells[i+1]==cells[i-1])
				temp[i]=1;
		}
		return temp;
	}
}