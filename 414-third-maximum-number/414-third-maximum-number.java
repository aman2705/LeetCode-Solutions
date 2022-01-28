class Solution {
    public int thirdMax(int[] nums) {
        PriorityQueue<Integer> pq=new PriorityQueue<Integer>(Collections.reverseOrder());
        HashSet<Integer> hm=new HashSet<Integer>();
        for(int i=0;i<nums.length;i++)
        {
            if(!hm.contains(nums[i]))
            {
                pq.add(nums[i]);
                hm.add(nums[i]);
            }
        }
        if(pq.size()>=3)
        {
             for(int i=1;i<3;i++)
            {
                pq.remove(pq.poll());
            }
            return pq.poll();
        }
        else
        {
            return pq.poll();
        }
       
    }
}