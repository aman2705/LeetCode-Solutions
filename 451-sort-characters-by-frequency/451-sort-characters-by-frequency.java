class Solution {
    public String frequencySort(String s) {
          List<Character> []bucket=new List[s.length()+1];
        HashMap<Character,Integer> hm=new HashMap<>();
        
        for (char c: s.toCharArray()) {
            hm.put(c, hm.getOrDefault(c, 0) + 1);
        }
        
        for(Character c:hm.keySet())
        {
            int freq=hm.get(c);
            if(bucket[freq]==null)
            {
                bucket[freq]=new ArrayList<>();
            }
            bucket[freq].add(c);
        }
        StringBuilder sb=new StringBuilder();
        for(int i=bucket.length-1;i>=0;i--)
        {
            if(bucket[i]!=null)
            {
                for(char c:bucket[i])
                {
                    for(int j=0;j<hm.get(c);j++)
                    {
                        sb.append(c);
                    }
                }
            }
        }
        return sb.toString();
    }
}