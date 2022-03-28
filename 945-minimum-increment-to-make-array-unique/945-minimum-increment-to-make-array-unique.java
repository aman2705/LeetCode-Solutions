class Solution {
    public int minIncrementForUnique(int[] nums) {
        if(nums.length==0)
            return 0;
        
          int maxVal = 0;
         for (int x : nums) 
        {
             maxVal = Math.max(maxVal, x);
        }
        int count=0;
         int[] freq = new int[nums.length + maxVal];
        for(int i=0;i<nums.length;i++)
        {
            freq[nums[i]]++;
        }
        for(int i=0;i<freq.length-1;i++)
        {
            if(freq[i]<=1)
                continue;
            
            int remains=freq[i]-1;
            count=count+remains;
            freq[i+1]=freq[i+1]+remains;
        }
        return count;
    }
}