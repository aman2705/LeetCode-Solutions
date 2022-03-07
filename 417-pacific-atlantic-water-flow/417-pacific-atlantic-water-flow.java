class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        
        List<List<Integer>> res=new ArrayList<>();
        int m=heights.length;
        int n=heights[0].length;
        
        int dirx[]={1,-1,0,0};
        int diry[]={0,0,1,-1};
        
        boolean [][] pacific=new boolean[m][n];
        boolean [][] atlantic=new boolean[m][n];
        for(int i=0;i<m;i++)
        {
            dfs(pacific,i,0,Integer.MIN_VALUE,dirx,diry,heights);
            dfs(atlantic,i,n-1,Integer.MIN_VALUE,dirx,diry,heights);
        }
        for(int i=0;i<n;i++)
        {
            dfs(pacific,0,i,Integer.MIN_VALUE,dirx,diry,heights);
            dfs(atlantic,m-1,i,Integer.MIN_VALUE,dirx,diry,heights);
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(pacific[i][j]==true && atlantic[i][j]==true)
                {
                    ArrayList<Integer> al=new ArrayList<>();
                    al.add(i);
                    al.add(j);
                    res.add(al);
                }
            }
        }
        return res;
        
    }
    private static void dfs(boolean [][]visited,
                           int x,int y,int height,
                           int dirx[],int diry[],int [][]heights)
    {
        if(x<0 || y<0 || x>=visited.length || y>=visited[0].length || height>heights[x][y] ||
           visited[x][y]==true)
            return;
        
        visited[x][y]=true;
        for(int i=0;i<4;i++)
        {
            dfs(visited,x+dirx[i],y+diry[i],heights[x][y],dirx,diry,heights);
        }
    }
}