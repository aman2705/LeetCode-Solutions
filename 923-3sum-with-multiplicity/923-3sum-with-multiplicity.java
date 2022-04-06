class Solution {
    public int threeSumMulti(int[] arr, int target) {
        
        HashMap<Integer,Long>hm=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            long freq = hm.getOrDefault(arr[i], 0l);
            hm.put(arr[i], freq+1l);
        }
        long ans=0;
        for(Integer el1: hm.keySet())
        {
            for(Integer el2 : hm.keySet())
            {
                int el3 = target -el1 -el2;
                if(hm.containsKey(el3))
                {
                    long freq1 = hm.get(el1);
                    long freq2 = hm.get(el2);
                    long freq3 = hm.get(el3);

                    if(el1 == el2 && el1 ==el3){
                        ans += ((freq1) * (freq1-1)*(freq1-2))/6;
                        
                    } else if(el1 ==el2 && el1!=el3){
                        ans += ((freq1)*(freq1-1))/2 *freq3;
                        
                    } else if(el1< el2 && el2<el3){
                        ans += ((freq1*freq2 *freq3));
                    }

                }
                ans = ans % 1000000007;
            }
        }
        return (int) ans;
    }
    
}