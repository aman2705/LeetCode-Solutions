class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        List<Integer> []bucket=new List[nums.length+1];
        for(int i=0;i<nums.length;i++)
        {
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        for(Integer i:hm.keySet())
        {
            int frequency=hm.get(i);
            if(bucket[frequency]==null)
            {
                bucket[frequency]=new ArrayList<>();
            }
            bucket[frequency].add(i);
        }
        
        int ans[]=new int[k];
        int start=0;
        for(int freq=bucket.length-1;freq>=0;freq--)
        {
            if(bucket[freq]!=null)
            {
                for(int j=0;j<bucket[freq].size();j++)
                {
                    ans[start++]=bucket[freq].get(j);
                    if(start==k)
                        break;
                }
            }
            if(start==k)
                break;
        }
        return ans;
    }
}