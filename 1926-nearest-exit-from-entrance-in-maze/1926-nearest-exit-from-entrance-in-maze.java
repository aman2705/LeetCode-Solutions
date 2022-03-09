class Solution {
    public int nearestExit(char[][] grid, int[] entrance) {
        
        Queue<int []> q=new LinkedList<>();
        q.add(entrance);
        grid[entrance[0]][entrance[1]]='+';
        int minsteps=0;
        
        int dirx[]={1,-1,0,0};
        int diry[]={0,0,1,-1};
        
        
        
        while(!q.isEmpty())
        {
            int size=q.size();
            
            for(int i=0;i<size;i++)
            {
                int curr[]=q.poll();
                int x=curr[0];
                int y=curr[1];
                
                for(int j=0;j<4;j++)
                {
                    int nx=x+dirx[j];
                    int ny=y+diry[j];
                    if(nx<0 || ny<0 || nx>=grid.length || ny>=grid[0].length  || grid[nx][ny]=='+')
                    {
                        continue;
                    }
                    if(nx==0 || ny==0 || nx==grid.length-1 || ny==grid[0].length-1)
                        return minsteps+1;
                    
                    q.add(new int[]{nx,ny});
                    grid[nx][ny]='+';
                }
            }
            
            minsteps++;
        }
        
        return -1;
    }
}