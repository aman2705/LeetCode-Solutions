class Solution {
    public List<List<Integer>> kSmallestPairs(int[] arr, int[] arr1, int k) {
        
        List<List<Integer>> res=new ArrayList<>();
        PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>() {
			public int compare(int []a,int []b)
			{
				if(a[2]<b[2])
					return 1;
				else if(a[2]>b[2])
					return -1;
				return 0;
			}
		});
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr1.length;j++)
			{
                if(pq.size()<k)
    				pq.offer(new int[] {arr[i],arr1[j],arr[i]+arr1[j]});
                
				 else if (arr[i]+arr1[j]<pq.peek()[2]) {
                    pq.poll();
                   pq.offer(new int[] {arr[i],arr1[j],arr[i]+arr1[j]});
                } else {
                    break;  // save time! since we don't need to traverse the rest 
                }
			
			}	
		}
		while(pq.size()!=0)
		{
			int a[]=pq.poll();
			ArrayList<Integer> al=new ArrayList<>();
            al.add(a[0]);
            al.add(a[1]);
            res.add(al);
		}
        return res;

    }
}