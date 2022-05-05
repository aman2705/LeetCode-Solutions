class Solution {
    public int findLengthOfLCIS(int[] nums) {
        
        int max=1;
        for(int i=0;i<nums.length;i++)
        {
            int count=1;
            for(int prev=i;prev<nums.length-1;prev++)
            {
                if(nums[prev]<nums[prev+1])
                    count++;
                
                else
                {
                     max=Math.max(max,count);
                     break;
                }
                   
            }
            max=Math.max(max,count);
        }
        return max;
    }
}