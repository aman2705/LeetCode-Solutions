class Solution {
    public int totalNQueens(int n) {
          char board[][]=new char[n][n];
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				board[i][j]='.';
			}
		}
		int col=0;
        int leftrow[]=new int[n];
        int lowdiag[]=new int[2*n-1];
        int uppdiag[]=new int[2*n-1];
        int count[]=new int[1];
		compute(col,board,leftrow,lowdiag,uppdiag,count);
		return count[0];
    }
     private  void compute(int col,char board[][],int leftrow[],
                         int lowdiag[],int uppdiag[],int count[])
	{
		if(col==board.length)
		{
            count[0]++;
			return;
		}
		
		for(int row=0; row<board.length ;row++)
		{
			if(leftrow[row]==0 && lowdiag[row+col]==0 && 
               uppdiag[(board.length-1)+(col-row)]==0)
            {
                board[row][col]='Q';
                leftrow[row]=1;
                lowdiag[row+col]=1;
                uppdiag[board.length-1+(col-row)]=1;
            
				compute(col+1,board,leftrow,lowdiag,uppdiag,count);
            
                leftrow[row]=0;
                lowdiag[row+col]=0;
                uppdiag[(board.length-1)+(col-row)]=0;
				board[row][col]='.';
            }
				
			
		}
		
     }
   
}