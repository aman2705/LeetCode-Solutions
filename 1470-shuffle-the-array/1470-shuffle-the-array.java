class Solution {
    public int[] shuffle(int[] nums, int n) {
        
        int count=0;
        int i=0;
        int ans[]=new int[nums.length];
        while(i<n)
        {
            ans[count]=nums[i];
            count=count+2;
            i++;
        } 
        count=1;
        while(n<nums.length)
        {
            ans[count]=nums[n];
            count=count+2;
            n++;
        }
        return ans;
    }
}