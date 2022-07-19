class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int row[]=new int[grid.length];
        int col[]=new int[grid.length];
        int index=0;
        // for row
        for(int i=0;i<grid.length;i++){
            int val=Integer.MIN_VALUE;
            for(int j=0;j<grid[i].length;j++){
                val=Math.max(val,grid[i][j]);
            }
            row[index++]=val;
        }
        
        // for column
        index=0;
        
        for(int i=0;i<grid[0].length;i++){
            int val=Integer.MIN_VALUE;
            for(int j=0;j<grid.length;j++){
                val=Math.max(val,grid[j][i]);
            }
            col[index++]=val;
        }
        int ans[][]=new int[grid.length][grid.length];
        for(int i=0;i<row.length;i++){
            for(int j=0;j<col.length;j++){
                ans[i][j]=Math.min(col[j],row[i]);
            }
        }
        // System.out.println(Arrays.toString(row));
        // System.out.println(Arrays.toString(col));
        // for(int a[]:ans){
        //     System.out.println(Arrays.toString(a));
        // }
        int sum=0;
        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans[0].length;j++){
                int val=ans[i][j]-grid[i][j];
                if(val>0)
                    sum=sum+val;
            }
        }
        return sum;
    }
}