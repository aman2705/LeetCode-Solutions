class Solution {
    public boolean canArrange(int[] arr, int k) {
        
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            int rem=arr[i]%k;
            
            if(rem<0)
                rem=rem+k;
            
            hm.put(rem,hm.getOrDefault(rem,0)+1);
        }
        for(Integer i:hm.keySet())
        {
            
            if(i==0)
            {
                if(hm.get(i)%2==1)
                    return false;
            }
            else if(2*i==k)
            {
                if(hm.get(i)%2==1)
                    return false;
            }
            else
            {
                int x=i;
                int rem=k-i;
                
                int count1=hm.get(x);
                int count2=hm.getOrDefault(rem,0);
                
                if(count1!=count2)
                    return false;
            }    
        }
        return true;
    }
}