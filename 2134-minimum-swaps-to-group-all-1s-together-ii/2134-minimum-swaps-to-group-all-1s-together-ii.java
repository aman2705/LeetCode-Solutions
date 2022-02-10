class Solution {
    public int minSwaps(int[] nums) {
        
        int num2s[]=new int[nums.length*2];
        // x represents the total number of ones present in the array
        int x=0;
        
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==1)
                x++;
        }
        
        int n=nums.length;
        for(int i=0;i<num2s.length;i++)
        {
            num2s[i]=nums[i%n];
        }
        int countofones=0;
        for(int i=0;i<x;i++)
        {
            if(num2s[i]==1)
                countofones++;
        }
        int maxones=countofones;
        
        for(int i=1;i<=num2s.length-x;i++)
        {
            if(num2s[i-1]==1)
                countofones--;
            
            if(num2s[i+x-1]==1)
                countofones++;
            
            if(maxones<countofones)
                maxones=countofones;
        }
        int maxzeroes=x-maxones;
        return maxzeroes;
    }
}