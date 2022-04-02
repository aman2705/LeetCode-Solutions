class Solution {
    public int[][] allCellsDistOrder(int rows, int cols, int rc, int cc) {
        
        	PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->a[2]-b[2]);
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				int dis=Math.abs(i-rc)+Math.abs(j-cc);
				pq.add(new int[] {i,j,dis});
			}
		}
		
		int start=0;
		int res[][]=new int[pq.size()][2];
		while(pq.size()!=0)
		{
			int a[]=pq.poll();
			res[start][0]=a[0];
			res[start][1]=a[1];
			start++;
		}
        return res;
       
    }
}