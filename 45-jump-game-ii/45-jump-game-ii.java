class Solution {
    public int jump(int[] nums) {
        int[] dp = new int[nums.length+1];
        Arrays.fill(dp,-1);
       return reachlast(nums,0,dp);
        
    }
     private static int reachlast(int nums[],int curri,int []dp)
    {
        if(curri>=nums.length-1)
            return 0;
        
        if(curri<0 || nums[curri]==0)
            return 1_000_000_000;
        
        if(dp[curri]!=-1)
        {
            return dp[curri];
        }
        
        int  result=1_000_000_000;
        for(int i=1;i<=nums[curri];i++)
        {
            result=Math.min(result,1+reachlast(nums,curri+i,dp));
        }
           
        
        return dp[curri]=result;
        
        
    }
}