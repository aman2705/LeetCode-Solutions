class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<int[]>pq=new PriorityQueue<>(new Comparator<int[]>() {
			public int compare(int a[],int b[])
			{
				if(a[0]>b[0])
					return -1;
				else if(a[0]<b[0])
					return 1;
				else
				{
					if(a[1]>b[1]) {
                        return -1;
                    }
					
                    else {
                        return 1;
                    }
				}
				
			}
		});
		for(int i=0;i<arr.length;i++)
		{
			int res=Math.abs(arr[i]-x);
			pq.add(new int[] {res,arr[i]});
			if(pq.size()>k)
				pq.poll();
		}
		ArrayList<Integer> al=new ArrayList<>();
		while(pq.size()!=0)
		{
			al.add(pq.poll()[1]);
		}
		Collections.sort(al);
        return al;
    }
    
}