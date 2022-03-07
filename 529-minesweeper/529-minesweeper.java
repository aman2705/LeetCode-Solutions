class Solution {
    public char[][] updateBoard(char[][] board, int[] click) {
        
      
        if(board[click[0]][click[1]]=='M')
        {
            board[click[0]][click[1]]='X';
            return board;
        }
        int dirx[]={1,-1,0,0,1,1,-1,-1};
        int diry[]={0,0,1,-1,1,-1,1,-1};
                            
         int mines = count(board, click[0], click[1],dirx,diry);
        if (mines != 0) {
            board[click[0]][click[1]] = (char) (mines + '0');
            return board;
        }
        
        board[click[0]][click[1]] = 'B';  
        
        Queue<int[]> q=new LinkedList<>();
        q.add(click);
        while(!q.isEmpty()){
            
            int a[]=q.poll();
            int x=a[0];
            int y=a[1];
            for(int i=0;i<8;i++)
            {
                int  nx=x+dirx[i];
                int  ny=y+diry[i];
                
                if(nx<0 || ny<0 || nx>=board.length || ny>=board[0].length || board[nx][ny]!='E')
                    continue;
                
                int mines1=count(board,nx,ny,dirx,diry);
                if(mines1!=0)
                {
                    board[nx][ny]=(char)(mines1+'0');
                    continue;
                }
                   
                board[nx][ny]='B';
                q.offer(new int[]{nx,ny});
            }
        }
        return board;
    }
    private static int  count(char board[][],int x,int y,int []dirx,int []diry)
    {
        int count=0;
        for(int i=0;i<8;i++)
        {
            int nx=x+dirx[i];
            int ny=y+diry[i];
            
            if (nx >= 0 && nx < board.length && ny >= 0 && ny < board[0].length && board[nx][ny] == 'M') {
                count++;
            }
        }
        return count;
    }
}