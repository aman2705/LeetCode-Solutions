class Solution {
    public int maxDistance(int[][] grid) {
        
         int dirx[]={1,-1,0,0};
        int diry[]={0,0,1,-1};
        int ans=0;
        int n=grid.length;
        Queue<int[]> q=new LinkedList<>();
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]==1)
                {
                   q.add(new int[]{i,j});
                }
            }
        }
         if(q.size() == n*n)
            return -1;
        else
            return bfs(grid,q,dirx,diry);
        
        
    }
    private static int bfs(int [][]grid,Queue<int[]>q,int[]dirx,int[]diry)
    {
        int count=0;
        while(!q.isEmpty())
        {
            int size=q.size();
            count++;
            for(int i=0;i<size;i++){
                
              int curr[]=q.poll();
              int x=curr[0];
              int y=curr[1];
            
              for(int j=0;j<4;j++){
                  
                int nx=x+dirx[j];
                int ny=y+diry[j];
                
                if(nx>=0 && ny>=0 && nx<grid.length && ny<grid[0].length  && grid[nx][ny]==0){
                    q.add(new int[]{nx,ny});
                    grid[nx][ny]=1;
                }
             }
        }
        
      }
         return count-1;
  }
}