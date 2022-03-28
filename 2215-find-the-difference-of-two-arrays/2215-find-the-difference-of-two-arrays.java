class Solution {
    public List<List<Integer>> findDifference(int[] a, int[] b) {
        HashSet<Integer> hm=new HashSet<>();
		HashSet<Integer> hm1=new HashSet<>();
		for(int ans:a)
		{
			hm.add(ans);
		}
		for(int ans:b)
		{
			hm1.add(ans);
		}
//		System.out.println(hm);
//		System.out.println(hm1);
		int arr[]=new int[hm.size()];
		int start=0;
		int newarr[]=new int[hm1.size()];
		for(Integer i:hm)
		{
			arr[start++]=i;
		}
		// System.out.println(Arrays.toString(arr));
		
		start=0;
		for(Integer i:hm1)
		{
			newarr[start++]=i;
		}
		// System.out.println(Arrays.toString(newarr));
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<newarr.length;j++)
			{
				if(arr[i]==newarr[j])
				{
					arr[i]=Integer.MIN_VALUE;
					newarr[j]=Integer.MIN_VALUE;
					break;
				}
				
			}
		}
		
		ArrayList<Integer> al=new ArrayList<>();
		ArrayList<Integer> al1=new ArrayList<>();
		List<List<Integer>> res=new ArrayList<>();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=Integer.MIN_VALUE)
				al.add(arr[i]);
		}
		for(int i=0;i<newarr.length;i++)
		{
			if(newarr[i]!=Integer.MIN_VALUE)
				al1.add(newarr[i]);
		}
		
		
		
		res.add(al);
		res.add(al1);
        return res;
    }
}