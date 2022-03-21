class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++)
            sum=sum+nums[i];
        
        if(sum%2==1)
            return false;
        
        int dp[][]=new int[nums.length][(sum/2)+1];
        int target=(sum/2);
        //System.out.println(target);
        
        for(int i=0;i<dp.length;i++)
            for(int j=0;j<dp[0].length;j++)
                dp[i][j]=-1;
        
        return solve(dp,nums,nums.length-1,target);
    }
    private static boolean solve(int [][]dp,int nums[],int index,int target)
    {
        if(target==0)
            return true;
        
        if(index==0)
            return nums[0]==target;
        
        if(dp[index][target]!=-1)
            return dp[index][target]==0?false:true;
        
        boolean ntake=solve(dp,nums,index-1,target);
        
        boolean take=false;
        if(nums[index]<=target)
            take=solve(dp,nums,index-1,target-nums[index]);
            
        dp[index][target]=ntake||take?1:0;
        return ntake||take;
        
    }
}