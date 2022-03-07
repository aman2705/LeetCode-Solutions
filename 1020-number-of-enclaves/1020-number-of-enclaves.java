class Solution {
    public int numEnclaves(int[][] grid) {
        
        int dirx[]={1,-1,0,0};
        int diry[]={0,0,1,-1};
        int count=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if( grid[i][j]==1 && i==0 || i== grid.length-1 || j==0 || j==grid[0].length-1)
                    dfs(grid,i,j,dirx,diry);
            }
        }
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]==1)
                    count++;
            }
        }
            
                
        return count;
    }
    private static void dfs(int [][] grid,int x,int y,int []dirx,int []diry)
    {
       if(x<0 || x>=grid.length || y<0 || y>=grid[0].length || grid[x][y]!=1)
            return;
        
        grid[x][y]=0;
        
       for(int i=0;i<4;i++)
       {
           int nx=x+dirx[i];
           int ny=y+diry[i];
           
           dfs(grid,nx,ny,dirx,diry);
       }
    }
}