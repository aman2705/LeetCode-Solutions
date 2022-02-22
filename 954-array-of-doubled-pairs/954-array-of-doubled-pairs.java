class Solution {
    public boolean canReorderDoubled(int[] arr) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        
        for(int i=0;i<arr.length;i++)
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        
        // we need to sort the array
        Integer []ar=new Integer[arr.length];
        for(int i=0;i<ar.length;i++)
            ar[i]=arr[i];
        
        Arrays.sort(ar,(a,b)->
        {
            return Math.abs(a)-Math.abs(b);            
        });
        // System.out.println(Arrays.toString(ar));
        for(Integer i:ar){
            
            // System.out.println(hm.get(i));
            if(hm.get(i)==0)
                continue;
            
            int ans=hm.getOrDefault(2*i,0);
            if(ans==0)
                return false;
            
            hm.put(i,hm.get(i)-1);
            hm.put(2*i,hm.get(2*i)-1);
        }
        return true;
        
    }
}