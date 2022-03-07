class Solution {
    public int shortestBridge(int[][] grid) {
        int n=grid.length;
        boolean marked=false;
        Queue<int[]> q=new LinkedList<>();
        for(int i=0;i<n;i++)
        {
            if(marked==true)
                break;
            
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]==1)
                {
                    marked=true;
                    dfs(grid,i,j,q);
                    break;
                }
            }
        }
        int dirx[]={1,-1,0,0};
        int diry[]={0,0,1,-1};
        int count=0;
        while(!q.isEmpty())
        {
            int size=q.size();
            for(int i=0;i<size;i++)
            {
                int curr[]=q.poll();
                int x=curr[0];
                int y=curr[1];
               
                // for all four dirns
                if(x-1>=0 && grid[x-1][y]==0)
                {
                    q.offer(new int[]{x-1,y});
                    grid[x-1][y]=2;
                }
                if(x+1<n && grid[x+1][y]==0)
                {
                    q.offer(new int[]{x+1,y});
                    grid[x+1][y]=2;
                }
                if(y-1>=0 && grid[x][y-1]==0)
                {
                    q.offer(new int[]{x,y-1});
                    grid[x][y-1]=2;
                }
                if(y+1<n && grid[x][y+1]==0)
                {
                    q.offer(new int[]{x,y+1});
                    grid[x][y+1]=2;
                }
                if( x-1>=0 && grid[x-1][y]==1 || 
                   x+1<n && grid[x+1][y]==1 || 
                   y-1>=0 && grid[x][y-1]==1 ||  
                   y+1<n && grid[x][y+1]==1)
                {
                    return count;
                }
                    
                
            }
            count++;
        }
        return count;
    }
    private static void dfs(int [][]grid,int x,int y,Queue<int[]> q)
    {
        if(x<0 || y<0 || x>=grid.length || y>=grid[0].length || grid[x][y]!=1)
            return ;
        
        grid[x][y]=2;
        q.offer(new int[]{x,y});
        dfs(grid,x-1,y,q);
        dfs(grid,x+1,y,q);
        dfs(grid,x,y+1,q);
        dfs(grid,x,y-1,q);
    }
}