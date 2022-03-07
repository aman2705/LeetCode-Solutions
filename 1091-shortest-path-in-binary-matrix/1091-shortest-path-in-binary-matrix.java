class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        
        if(grid[0][0]==1)
            return -1;
        
        int dirx[]={1,-1,0,0,1,1,-1,-1};
        int diry[]={0,0,1,-1,1,-1,1,-1};
        
        Queue<int[]> q=new LinkedList<>();
        q.add(new int[]{0,0,1});
        grid[0][0]=1;
        
        while(!q.isEmpty()){
            
            int curr[]=q.poll();
            int x=curr[0];
            int y=curr[1];
            int weight=curr[2];
            
            if(x==grid.length-1 && y==grid[0].length-1)
                return weight;
            
            for(int i=0;i<8;i++)
            {
                int nx=x+dirx[i];
                int ny=y+diry[i];
                
                if(nx>=0 && ny>=0 && nx<grid.length && ny<grid[0].length && grid[nx][ny]!=1)
                {
                    q.add(new int[]{nx,ny,weight+1});
                    grid[nx][ny]=1;
                }
            }

        }
        return -1;
    }
}