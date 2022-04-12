class Solution {
    public void gameOfLife(int[][] board) {
        
        int n= board.length;
        int m=board[0].length;
        
        int copy[][]=new int[n][m];
        
        for(int i=0;i<n;i++)
            for(int j=0;j<m;j++)
                copy[i][j]=board[i][j];
            
        int dx[]={1,1,0,-1,-1,-1,0,1};
        int dy[]={0, 1, 1, 1, 0, -1, -1, -1};
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                int livecount=0;
                for(int k=0;k<8;k++)
                {
                    if(safe(i+dx[k],j+dy[k],n,m) && copy[i+dx[k]][j+dy[k]]==1)
                    {
                         livecount++;
                    }
                }
                if(copy[i][j]==0 && livecount==3)
                    board[i][j]=1;
                else if(copy[i][j]==1 && livecount<2 || livecount>3)
                    board[i][j]=0;
            }
        }
      
        
    }
    private static boolean safe(int x,int y,int r,int c)
    {
        if(x>=0 && x<r && y>=0 && y<c)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}