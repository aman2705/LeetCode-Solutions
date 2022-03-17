class Solution {
    public String pushDominoes(String dominoes) {
        StringBuilder sb=new StringBuilder();
        sb.append('L');
        sb.append(dominoes);
        sb.append('R');
        
        char ch[]=sb.toString().toCharArray();
        int start=0;
        int end=1;
        while(end<ch.length-1)
        {
            while(ch[end]=='.')
                end++;

            solveconfig(ch,start,end);
            start=end;
            end++;
        }
        StringBuilder sb1=new StringBuilder();
        for(int i=1;i<ch.length-1;i++)
        {
            sb1.append(ch[i]);
        }
        return sb1.toString();
    }
    public static void solveconfig(char ch[],int start,int end)
    {
        if(ch[start]=='L' && ch[end]=='L')
        {
            for(int i=start+1;i<end;i++)
            {
                ch[i]='L';
            }
        }
        else if(ch[start]=='R' && ch[end]=='R')
        {
            for(int i=start;i<end+1;i++)
            {
                ch[i]='R';   
            }
        }
        else if(ch[start]=='L' && ch[end]=='R')
        {
            return;
        }
        else 
        {
            int length=end-start;
            int mid=(end+start)/2;
            if(length%2==0)
            {
               for(int i=start+1;i<mid;i++)
               {
                   ch[i]='R';
               }
                   
                for(int i=mid+1;i<end;i++)
                {
                    ch[i]='L';
                }
                    
            }
            
            else
            {
              for(int i=start+1;i<=mid;i++)
              {
                  ch[i]='R';
              }
                  
                for(int i=mid+1;i<end;i++)
                {
                    ch[i]='L';
                }
                    
            }
        }
        
        
    }
}