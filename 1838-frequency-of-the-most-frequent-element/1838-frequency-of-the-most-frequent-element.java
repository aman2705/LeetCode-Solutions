class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int left=0;
        int res=0;
        long score=0;
        for(int right=0;right<nums.length;right++)
        {
            score=score+nums[right];
            while(operations(left,right,score,nums)>k)
            {
                score=score-nums[left];
                left++;
            }
            res=Math.max(res,right-left+1);
        }
        return res;
    }
    private static long operations(int left,int right,long score,int nums[])
    {
        int numberofelements=right-left+1;
        int endnum=nums[right];
        return numberofelements*endnum-score;
    }
}