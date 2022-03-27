class Solution {
    public int[] kWeakestRows(int[][] arr, int k) {
      PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>() {
			 public int compare(int[] w2, int[] w1) {
				 if(w1[0] > w2[0]) {
	                    return -1;
	                }
				 else if(w1[0] < w2[0]) {
	                    return 1;
	                }
				 else
					{
					 if(w1[1]>w2[1]) {
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
			int onec=0;
			for(int j=0;j<arr[0].length;j++)
			{
				if(arr[i][j]==1)
					onec++;
			}
			pq.add(new int[] {onec,i});
		}
        int ans[]=new int[k];
        for(int i=0;i<k;i++)
            ans[i]=pq.poll()[1];
        return ans;
    }
}