class Solution {
    public String reorganizeString(String s) {
        int freq[]=new int[26];
        for(int i=0;i<s.length();i++)
        {
            freq[s.charAt(i)-'a']++;
        }
        PriorityQueue<pair> pq=new PriorityQueue<>((a,b)->b.count-a.count);
        for(int i=0;i<freq.length;i++)
        {
            int a=i+97;
            char chr=(char)a;
            if(freq[i]>0)
                pq.offer(new pair(chr,freq[i]));
        }
        // created a string
        StringBuilder sb=new StringBuilder();
        while(!pq.isEmpty())
        {
            pair p=pq.poll();
            char ch=p.ch;
            if(sb.length()==0 || sb.charAt(sb.length()-1)!=ch)
            {
                int count=p.count;
                sb.append(ch);
                count--;
                if(count>0)
                    pq.offer(new pair(ch,count));
            }
            else
            {
                if(pq.size()==0)
                    return "";
                
                pair p1=pq.poll();
                char ch1=p1.ch;
                int count=p1.count;
                
                sb.append(ch1);
                count--;
                
                if(count>0)
                    pq.offer(new pair(ch1,count));
                
                pq.offer(p);
            }
           
        }
        return sb.toString();
        
    }
    
}
class pair{
    char ch;
    int count;
    public pair(char ch,int count)
    {
        this.ch=ch;
        this.count=count;
    }
}