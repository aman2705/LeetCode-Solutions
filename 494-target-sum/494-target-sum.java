class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int totSum = 0;
    for(int i=0; i<nums.length;i++){
        totSum += nums[i];
    }
    
    //Checking for edge cases
    if(totSum-target<0) return 0;
    if((totSum-target)%2==1) return 0;
    
    int s2 = (totSum-target)/2;
        
        int dp[][]=new int[nums.length][s2+1];
        for(int i=0;i<dp.length;i++)
        {
            for(int j=0;j<dp[0].length;j++)
            {
                dp[i][j]=-1;
            }
        }
        return solve(dp,nums,nums.length-1,s2);
    }
    private static int solve(int [][]dp,int nums[],int index,int target)
    {
        if(index==0)
        {
            if(target==0 && nums[0]==0)
                return 2;
            
             if(target==0 || nums[0]==target)
                return 1;
            
                return 0;
        }
        if(dp[index][target]!=-1)
            return dp[index][target];
        
        int ntake=solve(dp,nums,index-1,target);
        
        int take=0;
        if(target>=nums[index])
            take=solve(dp,nums,index-1,target-nums[index]);
        
        return dp[index][target]=(ntake+take);
        
    }
}