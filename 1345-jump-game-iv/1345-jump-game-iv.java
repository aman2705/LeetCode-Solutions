class Solution {
    public int minJumps(int[] arr) {
        if(arr.length==1)
            return 0;
        
        int step=0;
		HashMap<Integer ,ArrayList<Integer>> hm=new HashMap<>();
		for(int i=0;i<arr.length;i++)
		{
			if(hm.containsKey(arr[i])==false)
			{
				ArrayList<Integer> al=new ArrayList<>();
				al.add(i);
				hm.put(arr[i], al);
			}
			else
			{
				ArrayList<Integer> al=hm.get(arr[i]);
				al.add(i);
				hm.put(arr[i], al);
			}
		}
		
		Queue<Integer> q=new LinkedList<>();
		q.add(0);
		while(!q.isEmpty())
		{
			step++;
			int size=q.size();
			for(int i=0;i<size;i++)
			{
				int j=q.poll();
				if(j-1>=0 && hm.containsKey(arr[j-1]))
				{
					q.add(j-1);
				}
				if(j+1<arr.length && hm.containsKey(arr[j+1]))
				{
					if(j+1==arr.length-1)
						return step;
                    
					q.add(j+1);
				}
				if(hm.containsKey(arr[j]))
				{
					ArrayList<Integer> al=hm.get(arr[j]);
					for(int k=0;k<al.size();k++)
					{
                        if(al.get(k)!=j)
                        {
                            if(al.get(k)==arr.length-1)
                                return step;
                            q.add(al.get(k));
                        }
						
                        
					}
				}
				hm.remove(arr[j]);
			}
		}
        return step;

    }
}