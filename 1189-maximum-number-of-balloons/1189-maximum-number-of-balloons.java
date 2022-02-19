class Solution {
    public int maxNumberOfBalloons(String text) {
        int freq[]=new int[26];
        for(int i=0;i<text.length();i++)
        {
            char ch=text.charAt(i);
            int index=ch-97;
            freq[index]++;
        }
        int count1=0;
        while(freq[0]>0)
        {
            boolean b=false;
            boolean c=false;
            boolean d=false;
            boolean e=false;
            
            for(int i=1;i<freq.length;i++)
            {
                int a=i+97;
                char ch=(char)a;
                int count=freq[i];
                if(ch=='b')
                {
                    if(count>0)
                    {
                        freq[i]=freq[i]-1;
                        b=true;
                    }
                    else
                    {
                        b=false;
                    }
                }
                if(ch=='o')
                {
                    if(count>1)
                    {
                        freq[i]=freq[i]-2;
                        c=true;
                    }
                    else
                    {
                        c=false;
                    } 
                }
                if(ch=='l')
                {
                   if(count>1)
                    {
                        freq[i]=freq[i]-2;
                        d=true;
                    }
                    else
                    {
                        d=false;
                    } 
                }
                if(ch=='n')
                {
                    if(count>0)
                    {
                        freq[i]=freq[i]-1;
                        e=true;
                    }
                    else
                    {
                        e=false;
                    }
                }
            }
            if(b==true && c==true && d==true && e==true)
                count1++;
            
            freq[0]--;
        }
        return count1;
    }
}