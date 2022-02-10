class Solution {
    public int rob(int[] nums) {
        
        if(nums.length==1)
        {
            return nums[0];
        }
        int ans[]=new int[nums.length-1];
        int ans2[]=new int[nums.length-1];
        int dp1[]=new int[ans.length];
        int dp2[]=new int[ans2.length];
        Arrays.fill(dp1,-1);
        Arrays.fill(dp2,-1);
        for(int i=0;i<nums.length-1;i++)
        {
            ans[i]=nums[i];
        }
        for(int i=1;i<nums.length;i++)
        {
            ans2[i-1]=nums[i];
        }
        
        int res=maximum(ans,ans.length-1,dp1);
        int res1=maximum(ans2,ans2.length-1,dp2);
        
        return Math.max(res,res1);
        
    }
    private static int maximum(int ans[],int index,int dp[])
    {
        if(index==0)
        {
            return ans[index];
        }
        if(index<0)
        {
            return 0;
        }
        if(dp[index]!=-1)
            return dp[index];
        
        int pick=ans[index]+maximum(ans,index-2,dp);
        int notpick=0+maximum(ans,index-1,dp);
        
        return dp[index]=Math.max(pick,notpick);
    }
}