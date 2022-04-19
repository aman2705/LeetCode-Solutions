class Solution {
    public int minDistance(String word1, String word2) {
        
        char arr[]=word1.toCharArray();
        char arr2[]=word2.toCharArray();
        int dp[][]=new int[word1.length()][word2.length()];
        for(int i=0;i<dp.length;i++)
        {
            for(int j=0;j<dp[0].length;j++)
            {
                dp[i][j]=-1;
            }
        }
        return solve(word1.length()-1,word2.length()-1,arr,arr2,dp);
    }
    private static int solve(int index1,int index2,char arr[],char arr2[],int [][]dp)
    {
        if(index2<0)
            return index1+1;
        
        if(index1<0)
            return index2+1;
        
        
        
        if(dp[index1][index2]!=-1)
            return dp[index1][index2];
        
        if(arr[index1]==arr2[index2])
           return dp[index1][index2]=solve(index1-1,index2-1,arr,arr2,dp);
        
        else
        {
            int delete=1+solve(index1-1,index2,arr,arr2,dp);
            int insert=1+solve(index1,index2-1,arr,arr2,dp);
            int replace=1+solve(index1-1,index2-1,arr,arr2,dp);
            return dp[index1][index2]=Math.min(delete,Math.min(insert,replace));
        }
    }
}