class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b) -> Integer.compare(a[0], b[0]));
//		for(int i[]:intervals)
//			System.out.println(Arrays.toString(i));
		ArrayList<int[]> al=new ArrayList<>();
		int start=intervals[0][0];
		int end=intervals[0][1];
		for(int i[]:intervals)
		{
			if(end>=i[0])
			{
				end=Math.max(end, i[1]);
			}
			else
			{
				al.add(new int[] {start,end});
				start=i[0];
				end=i[1];
			}
		}
		al.add(new int[] {start,end});
		return al.toArray(new int[al.size()][]);
    }
}