class Solution {
    public boolean canJump(int[] nums) {
        Boolean[] dp = new Boolean[nums.length+1];
       return reachlast(nums,0,dp);
    }
    private static boolean reachlast(int nums[],int curri,Boolean []dp)
    {
        if(curri>=nums.length-1)
            return true;
        
        if(curri<0 || nums[curri]==0)
            return false;
        
        if(dp[curri]!=null)
        {
            return dp[curri];
        }
        
        boolean result=false;
        for(int i=1;i<=nums[curri];i++)
        {
             result=result | reachlast(nums,curri+i,dp);
            if(result==true)
                break;
        }
           
        
        return dp[curri]=result;
        
        
    }
}