class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        
        HashMap<String,Integer> hm=new HashMap<>();
        for(int i=0;i<words.length;i++)
        {
            hm.put(words[i],hm.getOrDefault(words[i],0)+1);
        }
        PriorityQueue<Pair> pq=new PriorityQueue<Pair>(new Comparator<Pair>(){
            public int compare(Pair p1,Pair p2)
            {
              if(p2.count>p1.count)
              {
                   return 1;
              }
              else if(p1.count>p2.count)
              {
                   return -1;
              }
              else
              {
                    int ans=p1.s.compareTo(p2.s);
                    if(ans<=0)
                        return -1;
                    
                    else
                        return 1;
                }
            }
        });
        for(String i:hm.keySet())
        {
            pq.offer(new Pair(i,hm.get(i)));
        }
        ArrayList<String> al=new ArrayList<>();
        for(int i=0;i<k;i++)
        {
            al.add(pq.poll().s);
        }
        return al;
            
          
    }
}
class Pair{
    String s;
    int count;
    public Pair(String s,int count)
    {
        this.s=s;
        this.count=count;
    }
}