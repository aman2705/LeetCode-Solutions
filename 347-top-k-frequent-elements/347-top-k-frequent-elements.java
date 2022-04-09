class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
       PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>() {
           
            public int compare(int []a,int b[]){
                if(a[1]<b[1])
                    return 1;
                else if(a[1]>b[1])
                    return -1;
                return 0;
            }
        });
        for(Integer i:hm.keySet())
        {
            pq.add(new int[]{(int)i,hm.get(i)});
        }
            
        
        int ans[]=new int[k];
        for(int i=0;i<ans.length;i++)
            ans[i]=pq.poll()[0];
        
        return ans;
    }
}