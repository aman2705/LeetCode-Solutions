class Solution {
    public int longestOnes(int[] a, int k) {
        
        int j=-1;
        int count=0;
        int ans=0;
         HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==0)
                count++;
            hm.put(a[i],hm.getOrDefault(a[i],0)+1);
            if(count>k)
            {
                while(count>k)
                {
                    j++;
                    if(a[j]==0)
                        count--;
                    
                   if(hm.get(a[j])==1)
                         hm.remove(a[j]);
                    
                     else
                        hm.put(a[j],hm.get(a[j])-1);
                    
                    
                    if(count==k)
                        break;
                }
            }
            int len=i-j;
            if(ans<len)
            {
                ans=len;
            }
        }
        return ans;
    }
}