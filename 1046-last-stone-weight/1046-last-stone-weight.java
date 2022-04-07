class Solution {
    public int lastStoneWeight(int[] a) {
       
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
		for(int i=0;i<a.length;i++)
		{
			pq.add(a[i]);
		}
		while(pq.size()!=1)
		{
			int c=pq.poll();
			int d=pq.poll();
			int e=c-d;
			pq.add(e);
		 }
		// System.out.println(pq.poll());
        return pq.poll();
    }
}