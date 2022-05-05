class Solution {
    public int lengthOfLIS(int[] nums) {
        int dp[][]=new int[nums.length][nums.length+1];
        for(int i=0;i<dp.length;i++)
        {
            for(int j=0;j<dp[0].length;j++)
            {
                dp[i][j]=-1;
            }
        }
        int res=solve(0,-1,dp,nums);
        return res;
    }
    private static int solve(int index,int prev_index,int dp[][],int nums[]){
        if(index==nums.length)
            return 0;
        
        if(dp[index][prev_index+1]!=-1)
            return dp[index][prev_index+1];
        
        int len=0+solve(index+1,prev_index,dp,nums);
        
        if(prev_index==-1 || nums[prev_index]<nums[index])
        {
            len=Math.max(len,1+solve(index+1,index,dp,nums));
        }
            
        
        return dp[index][prev_index+1]=len;
    }
}