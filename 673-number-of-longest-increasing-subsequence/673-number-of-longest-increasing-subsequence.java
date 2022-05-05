class Solution {
    public int findNumberOfLIS(int[] nums) {
        
        int dp[]=new int[nums.length];
        int count[]=new int[nums.length];
        
        int max=1;
        for(int i=0;i<nums.length;i++)
        {
            dp[i]=1;
            count[i]=1;
            for(int prev=0;prev<i;prev++)
            {
                if(nums[i]>nums[prev] && 1+dp[prev]>dp[i])
                {
                    dp[i]=dp[prev]+1;
                    count[i]=count[prev];
                }
                else if(nums[i]>nums[prev] && 1+dp[prev]==dp[i])
                {
                    dp[i]=dp[prev]+1;
                    count[i]=count[i]+count[prev];
                }
            }
            max=Math.max(dp[i],max);
        }
        int res=0;
        for(int i=0;i<dp.length;i++)
        {
            if(dp[i]==max)
                res=res+count[i];
        }
        return res;
    }
}