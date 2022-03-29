class Solution {
    public int countBattleships(char[][] board) {
        
        int count=0;
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
            {
                if(board[i][j]=='X')
                {
                    count++;
                    dfs(board,i,j);
                }
            }
        }
        return count;
    }
    private static void dfs(char [][]board,int x,int y)
    {
    
        if(x<0 || x>=board.length || y<0 || y>=board[0].length || board[x][y]=='.')
            return ;
    
        board[x][y]='.';
        
        dfs(board,x-1,y);
        dfs(board,x+1,y);
        dfs(board,x,y+1);
        dfs(board,x,y-1);
    }
}