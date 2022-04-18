class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        int end=intervals[0][1];
        int count=0;
        for(int i=1;i<intervals.length;i++)
        {
            if(end>intervals[i][0])
            {
                count++;
                end=Math.min(end,intervals[i][1]);
            }
            else
            {
                end=intervals[i][1];
            }
        }
        return count;
    }
}