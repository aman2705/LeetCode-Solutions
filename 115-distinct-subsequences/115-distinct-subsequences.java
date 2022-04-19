class Solution {
    public int numDistinct(String s, String t) {
        
        int [][]dp=new int[s.length()][t.length()];
        for(int i=0;i<dp.length;i++)
        {
            for(int j=0;j<dp[0].length;j++)
            {
                dp[i][j]=-1;
            }
        }
        char arr[]=s.toCharArray();
        char arr2[]=t.toCharArray();
        return solve(s.length()-1,t.length()-1,arr,arr2,dp);
    }
    private static int solve(int index1,int index2,char []arr,char arr2[],int [][]dp)
    {
        if(index2<0)
            return 1;
        
        if(index1<0)
            return 0;
        
        
        
        if(dp[index1][index2]!=-1)
            return dp[index1][index2];
        
        if(arr[index1]==arr2[index2])
        {
            int take=solve(index1-1,index2-1,arr,arr2,dp);
            int nottake=solve(index1-1,index2,arr,arr2,dp);
            return dp[index1][index2]=take+nottake;
        }
        else
        {
             int nottake=solve(index1-1,index2,arr,arr2,dp);
             return dp[index1][index2]=nottake;
        }
       
        
        
    }
}