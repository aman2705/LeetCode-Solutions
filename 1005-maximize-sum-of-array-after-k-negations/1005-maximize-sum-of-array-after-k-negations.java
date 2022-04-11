class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<nums.length;i++)
            pq.add(nums[i]);
        while(k>0)
        {
            pq.add(-pq.poll());
            k--;
        }
        int sum=0;
        while(pq.size()!=0)
            sum=sum+pq.poll();
        return sum;
    }
}