class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        
         int dirx[]={1,-1,0,0};
        int diry[]={0,0,1,-1};
        int ans=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                int count[]=new int[1];
                if(grid[i][j]==1)
                {
                    dfs(grid,count,i,j,dirx,diry);
                    ans=Math.max(ans,count[0]);
                }
            }
        }
        return ans;
    }
    private static void dfs(int[][]grid,int count[],int x,int y,int dirx[],int diry[])
    {
        if(x<0 || x>=grid.length || y<0 || y>=grid[0].length || grid[x][y]!=1)
            return;
        
        grid[x][y]=2;
        count[0]++;
        
       for(int i=0;i<4;i++)
       {
           int nx=x+dirx[i];
           int ny=y+diry[i];
           
           dfs(grid,count,nx,ny,dirx,diry);
       }
    }
}