class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int dirx[]={1,-1,0,0};
        int diry[]={0,0,1,-1};
        Queue<int[]> q = new ArrayDeque<>();
        
         for(int i=0;i<mat.length;i++)
         {
             for(int j=0;j<mat[i].length;j++)
             {
                 if(mat[i][j]==0)
                     q.offer(new int[]{i,j});
                 else
                     mat[i][j]=-1;
             }
         }
        
        int row=mat.length;
        int col=mat[0].length;
        while(!q.isEmpty())
        {
            int []a=q.poll();
            int r=a[0];
            int c=a[1];
            for(int i=0;i<4;i++)
            {
                int nr=r+dirx[i];
                int nc=c+diry[i];
                
                if(nr<0 || nc<0 || nr==row || nc==col || mat[nr][nc]!=-1)
                    continue;
                
                mat[nr][nc]=mat[r][c]+1;
                q.add(new int[]{nr,nc});
            }
        }
        return mat;
    }
}