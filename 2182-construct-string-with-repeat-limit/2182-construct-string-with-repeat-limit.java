class Solution {
    public String repeatLimitedString(String s, int repeatLimit) {
        int freq[]=new int[26];
        for(int i=0;i<s.length();i++)
        {
            freq[s.charAt(i)-'a']++;
        }
        // created a pq of char-frequency max heap
        PriorityQueue<Pair> pq=new PriorityQueue<>((a,b)->b.ch-a.ch);
        for(int i=0;i<freq.length;i++)
        {
            int a=i+97;
            char chr=(char)a;
            if(freq[i]>0)
                pq.offer(new Pair(chr,freq[i]));
        }
        // created a string
        StringBuilder sb=new StringBuilder();
        while(!pq.isEmpty())
        {
            Pair p=pq.poll();
            char ch=p.ch;
           
            if(sb.length()==0 || sb.charAt(sb.length()-1)!=ch)
            {
                 int count=p.count;
                 int times=Math.min(count,repeatLimit);
                
                for(int i=0;i<times;i++)
                    sb.append(ch);
                
                count=count-times;
                if(count>0)
                    pq.offer(new Pair(ch,count));
            }
            else
            {
                if(pq.size()==0)
                    break;
                
                Pair p1=pq.poll();
                char ch1=p1.ch;
                int count=p1.count;
                
                sb.append(ch1);
                count--;
                
                if(count>0)
                    pq.offer(new Pair(ch1,count));
                
                pq.offer(p);
            }
        }
        return sb.toString();
    }
    
}
class Pair
{
    char ch;
    int count;
    public Pair(char ch,int count)
    {
        this.ch=ch;
        this.count=count;
    }
}
