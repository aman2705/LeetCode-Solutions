class Solution {
    public int findUnsortedSubarray(int[] nums) {
         int temp[]=nums.clone();
        Arrays.sort(nums);
       
        int start=0;
        
        
        while(start<nums.length-1 && nums[start]==temp[start])
            start++;
        
        int end=nums.length-1;
        while(end>start && nums[end]==temp[end])
            end--;
        
        if(start==end)
            return 0;
        
        return end-start+1;
    }
}