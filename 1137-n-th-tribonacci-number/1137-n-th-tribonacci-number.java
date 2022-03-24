class Solution {
    public int tribonacci(int n) {
        int dp[]=new int[n+1];
        for(int i=0;i<dp.length;i++)
        {
            dp[i]=-1;
        }
        int ans=memo(n,dp);
        return ans;
    }
    private static int memo(int n,int dp[])
    {
        if(n==0 || n==1)
            return dp[n]=n;
        
        else if(n<0)
            return 0;
        
        if(dp[n]!=-1)
            return dp[n];
        
        int one=memo(n-1,dp);
        int two=memo(n-2,dp);
        int three=memo(n-3,dp);
        
        return dp[n]=one+two+three;
        
    }
}