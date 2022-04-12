class Solution {
    public int minDistance(String word1, String word2) {
        
        int length1=word1.length();
        int length2=word2.length();
        int dp[][]=new int[length1][length2];
        for(int i=0;i<dp.length;i++)
        {
            for(int j=0;j<dp[0].length;j++)
            {
                dp[i][j]=-1;
            }
        }
        char ch1[]=word1.toCharArray();
        char ch2[]=word2.toCharArray();
        int ans=solve(dp,length1-1,length2-1,ch1,ch2);
        return (length1-ans)+(length2-ans);
    }
     private static int solve(int [][]dp,int index1,int index2,char ch[],char ch2[])
    {
         if(index1<0 || index2<0)
             return 0;
         
         if(dp[index1][index2]!=-1)
             return dp[index1][index2];
         
         if(ch[index1]==ch2[index2])
         {
             return dp[index1][index2]=1+solve(dp,index1-1,index2-1,ch,ch2);
         }
         else
         {
             return dp[index1][index2]=Math.max(solve(dp,index1-1,index2,ch,ch2),
                                               solve(dp,index1,index2-1,ch,ch2));
         }
    }
}