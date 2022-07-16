class Solution {
    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        int dp[][][]=new int[m][n][maxMove+1];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<dp[i].length;j++){
                for(int k=0;k<dp[i][j].length;k++){
                    dp[i][j][k]=-1;
                }
            }
        }
        return solve(dp,startRow,startColumn,maxMove,m,n);
    }
    private static int solve(int dp[][][],int i,int j,int moves,int m,int n){
        if(i<0 || j<0 || i>=m || j>=n)
            return 1;
        
        if(moves==0)
            return 0;
        
        if(dp[i][j][moves]!=-1)
            return dp[i][j][moves];
        
        return dp[i][j][moves]= 
        ((solve(dp,i-1,j,moves-1,m,n)+
        solve(dp,i+1,j,moves-1,m,n))%1000000007+
        (solve(dp,i,j-1,moves-1,m,n)+
        solve(dp,i,j+1,moves-1,m,n))%1000000007)%1000000007;
        
        
    }
}