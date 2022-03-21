class Solution {
    public int coinChange(int[] coins, int amount) {
        
        int n=coins.length-1;
        int dp[][]=new int[coins.length][amount+1];
        
       for(int i=0;i<dp.length;i++)
       {
           for(int j=0;j<dp[0].length;j++)
           {
               dp[i][j]=-1;
           }
       }
        int ans=solve(dp,coins,n,amount);
        if(ans>=(int)1e9)
            return -1;
        else
            return ans;
        
    }
    private static int solve(int [][]dp,int []coins,int  index,int amount)
    {
        if(index==0)
        {
            if(amount%coins[0]==0)
            {
                return amount/coins[0];
            }
            else
            {
                return (int)1e9;
            }
        }
        if(dp[index][amount]!=-1)
            return dp[index][amount];
        
        int ntake=solve(dp,coins,index-1,amount);
        int take=(int)1e9;
        if(coins[index]<=amount)
            take=1+solve(dp,coins,index,amount-coins[index]);
       return dp[index][amount]=Math.min(ntake,take);
    }
    
}