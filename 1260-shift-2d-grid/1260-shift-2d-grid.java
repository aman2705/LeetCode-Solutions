class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        
        while(k>0)
        {
            helper(grid);
            k--;
        }
        List<List<Integer>> al=new ArrayList<>();
      for(int i=0;i<grid.length;i++)
      {
          ArrayList<Integer> res=new ArrayList<>();
          for(int j=0;j<grid[0].length;j++)
          {
              res.add(grid[i][j]);
          }
          al.add(res);
      }
        return al;
    }
    public static void helper(int [][]grid)
    {
        int m=grid.length;
        int n=grid[0].length;
        int temp[][]=new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==m-1 && j==n-1)
                {
                    temp[0][0]=grid[i][j];
                }
                else if(j==n-1)
                {
                    temp[i+1][0]=grid[i][j];
                }
                else
                {
                    temp[i][j+1]=grid[i][j];
                }
            }
        }
        for(int i=0;i<temp.length;i++)
        {
            for(int j=0;j<temp[0].length;j++)
            {
                grid[i][j]=temp[i][j];
            }
        }
    }
}