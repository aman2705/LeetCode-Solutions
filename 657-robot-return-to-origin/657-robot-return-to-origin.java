class Solution {
    public boolean judgeCircle(String moves) {
        int dx[]={1,0,0,-1};
        int dy[]={0,1,-1,0}; 
        int x=0;
        int y=0;
        for(int i=0;i<moves.length();i++)
        {
            char ch=moves.charAt(i);;
            if(ch=='U')
            {
                x=x+dx[1];
                y=y+dy[1];
            }
            else if(ch=='D')
            {
                x=x+dx[2];
                y=y+dy[2];
            }
            else if(ch=='L')
            {
                x=x+dx[3];
                y=y+dy[3];
            }
            else
            {
                x=x+dx[0];
                y=y+dy[0];
            }
        }
        if(x==0 && y==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}