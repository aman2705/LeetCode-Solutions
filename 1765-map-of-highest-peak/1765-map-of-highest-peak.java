class Solution {
    public int[][] highestPeak(int[][] isWater) {
        int dirx[]={1,-1,0,0};
        int diry[]={0,0,1,-1};
         Queue<int []> q=new LinkedList<>();
        for(int i=0;i<isWater.length;i++)
        {
            for(int j=0;j<isWater[0].length;j++)
            {
                if(isWater[i][j]==1)
                {
                    q.add(new int[]{i,j});
                    isWater[i][j]=0;
                }
                else
                {
                    isWater[i][j]=-1;
                }
            }
            
        }
        while(!q.isEmpty()){
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
                    if(nx<0 || ny<0 || nx>=isWater.length || ny>=isWater[0].length  || isWater[nx][ny]!=-1)
                    {
                        continue;
                    }
                    q.offer(new int[]{nx,ny});
                    isWater[nx][ny]=isWater[x][y]+1;
                }
            }
        }
        return isWater;
    }
}