class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int sum=0;
        int count=0;
        hm.put(0,1);
        for(int i=0;i<nums.length;i++)
        {
            sum=sum+nums[i];
            if(hm.containsKey(sum-goal))
            {
                count=count+hm.get(sum-goal);
            }
            hm.put(sum,hm.getOrDefault(sum,0)+1);
        }
        return count;
    }
}