class Solution {
    public int countSubIslands(int[][] grid, int[][] grid2) {
       
        int dirx[]={1,-1,0,0};
        int diry[]={0,0,1,-1};
        int count=0;
        
        for(int i=0;i<grid2.length;i++)
        {
            for(int j=0;j<grid2[0].length;j++)
            {
                if(grid[i][j]==1 && grid2[i][j]==1)
                {
                    
                    if(dfs(grid,grid2,i,j))
                        count++;
                }
                   
            }
        }
        return count;
    }
     private static boolean dfs(int [][] grid,int grid2[][],int x,int y)
    {
       if(x<0 || x>=grid.length || y<0 || y>=grid[0].length || grid2[x][y]!=1 )
            return true;
         
         if(grid[x][y]!=grid2[x][y])
             return false;
        
         grid2[x][y]=0;
         
         boolean a=dfs(grid,grid2,x-1,y);
         boolean b=dfs(grid,grid2,x+1,y);
         boolean c=dfs(grid,grid2,x,y+1);
         boolean d=dfs(grid,grid2,x,y-1);
         
        return a && b&& c&& d; 
    }
}