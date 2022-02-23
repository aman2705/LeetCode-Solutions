class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        
        ArrayList<String> res=new ArrayList<>();
        HashMap<String,Integer> hm=new HashMap<>();
        for(String words:cpdomains)
        {
            String temp[]=words.split(" ");
            int count=Integer.parseInt(temp[0]);
            
            String name[]=temp[1].split("\\.");
            StringBuilder sb=new StringBuilder();
            
            for(int i=name.length-1;i>=0;i--)
            {
              if(i==name.length-1)
                  sb.append(name[i]);
                else
                {
                     sb.insert(0,".");
                    sb.insert(0,name[i]);
                }
                if(hm.containsKey(sb.toString()))
                {
                    int of=hm.get(sb.toString());
                    int nf=of+count;
                    hm.put(sb.toString(),nf);
                }
                else
                {
                    hm.put(sb.toString(),count);
                }
            }
        }
       
        for(String i:hm.keySet())
        {
             StringBuilder sb=new StringBuilder();
            sb.append(hm.get(i));
            sb.append(" ");
            sb.append(i);
                      
            res.add(sb.toString());
        }
        return res;
        
    }
}