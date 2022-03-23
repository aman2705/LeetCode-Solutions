class Solution {
    public int change(int amount, int[] coins) {
        int dp[][]=new int[coins.length][amount+1];
        for(int i=0;i<dp.length;i++)
        {
            for(int j=0;j<dp[0].length;j++)
            {
                dp[i][j]=-1;
            }
        }
        return solve(coins.length-1,amount,coins,dp);
    }
    private static int solve(int index,int amount,int []coins,int dp[][])
    {
        if(index==0)
        {
            if(amount%coins[0]==0)
                return 1;
            else
                return 0;
        }
        if(dp[index][amount]!=-1)
            return dp[index][amount];
        
        int nottake=solve(index-1,amount,coins,dp);
        int take=0;
        if(amount>=coins[index])
            take=solve(index,amount-coins[index],coins,dp);
         
        return dp[index][amount]=nottake+take;    
    }
}