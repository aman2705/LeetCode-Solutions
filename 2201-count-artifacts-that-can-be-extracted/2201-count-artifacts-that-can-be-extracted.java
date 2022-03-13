class Solution {
    public int digArtifacts(int n, int[][] artifacts, int[][] dig) {
        
        int count=0;
        boolean vis[][]=new boolean[n][n];
        for(int dig1[]:dig){
            vis[dig1[0]][dig1[1]]=true;
        }
        for(int a[]:artifacts){
            int r1=a[0];
            int c1=a[1];
            int r2=a[2];
            int c2=a[3];
            boolean res=true;
            for(int i=r1;i<=r2;i++)
            {
                 for(int j=c1;j<=c2;j++)
                 {
                     if(vis[i][j]!=true)
                     {
                          res=false;
                          break;
                     }   
                 }
            }
            if(res==true)
                count++;
        }
        return count;
    }
}