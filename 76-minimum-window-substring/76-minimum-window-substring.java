class Solution {
    public String minWindow(String s, String t) {
        
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<t.length();i++)
        {
             char ch=t.charAt(i);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        int i=-1;
        int j=-1;
        StringBuilder sb=new StringBuilder();
        HashMap<Character,Integer> smap=new HashMap<>();
        int count=0;
        String ans="";
        int length=t.length();
        while(true){
            boolean a=false;
            boolean b=false;
            while(i<s.length()-1 && count<length)
            {
                a=true;
                i++;
                char ch=s.charAt(i);
                sb.append(ch);
                smap.put(ch,smap.getOrDefault(ch,0)+1);
                
                if(smap.getOrDefault(ch,0)<=hm.getOrDefault(ch,0))
                {
                    count++;
                }
                    
            }
            while(j<i && count==length)
            {
                // String pans=s.substring(j+1,i+1);
                b=true;
                if(ans.length()==0 || ans.length()>sb.length())
                {
                    ans=sb.toString();
                }
                j++;
               sb.deleteCharAt(0);
                
                char ch=s.charAt(j);
                if(smap.get(ch)==1)
                {
                     smap.remove(ch);
                }
                else
                {
                    smap.put(ch,smap.get(ch)-1);
                }
                 if(smap.getOrDefault(ch,0)<hm.getOrDefault(ch,0))
                 {
                     count--;
                 }
                    
            }
            if(a==false && b==false)
                break;
        }
        return ans;
    }
}