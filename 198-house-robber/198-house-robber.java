class Solution {
    public int rob(int[] nums) {
        
        int dp[]=new int[nums.length];
        Arrays.fill(dp,-1);
        int res=solve(nums,dp,nums.length-1);
        return res;
    }
    public static int solve(int nums[],int dp[],int index){
        if(index<0)
            return 0;
        
        if(index==0)
            return nums[index];
        
        if(dp[index]!=-1)
            return dp[index];
        
        int pick=nums[index]+solve(nums,dp,index-2);
        int notpick=solve(nums,dp,index-1);
        
        return dp[index]=Math.max(pick,notpick);
    }
}