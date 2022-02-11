class Solution {
    public int uniquePaths(int m, int n) {
        
        int dp[][]=new int[m][n];
        for(int i=0;i<dp.length;i++)
        {
            for(int j=0;j<dp[0].length;j++)
            {
                dp[i][j]=-1;
            }
        }
        return maximum(m-1,n-1,dp);
    }
    private static int maximum(int i,int j,int dp[][])
    {
        if(i==0 && j==0)
            return 1;
        if(i<0 || j<0)
            return 0;
        
        if(dp[i][j]!=-1)
            return dp[i][j];
        
        int left=maximum(i-1,j,dp);
        int up=maximum(i,j-1,dp);
        return dp[i][j]=left+up;
    }
}