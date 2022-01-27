class Solution {
    public int[][] generateMatrix(int n) {
     
        int ans[][]=new int[n][n];
        
         int top=0;
        int bottom=ans.length-1;
        int left=0;
        int right=ans[0].length-1;
        int dir=0;
        int curr=1;
        while(left<=right && top<=bottom)
        {
            if(dir==0)
            {
                for(int i=left;i<=right;i++)
                   ans[top][i]=curr++;
                
                top++;
            }
            else if(dir==1)
            {
                for(int i=top;i<=bottom;i++)
                   ans[i][right]=curr++;
                
                right--;
            }
            else if(dir==2)
            {
                for(int i=right;i>=left;i--)
                   ans[bottom][i]=curr++;
                
                bottom--;
            }
            else if(dir==3)
            {
                for(int i=bottom;i>=top;i--)
                    ans[i][left]=curr++;
                
                left++;
            }
            dir=(dir+1)%4;
        }
        return ans;
    }
}