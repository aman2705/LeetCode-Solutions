class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        Arrays.sort(nums);
        
        int dp[]=new int[nums.length];
        int hash[]=new int[nums.length];
        
        Arrays.fill(dp,1);
        
        int max=1;
        int lastindex=0;
        
        for(int i=0;i<nums.length;i++){
            hash[i]=i;
            for(int prev=0;prev<i;prev++)
            {
                if(nums[i]%nums[prev]==0 
                   && 1+dp[prev]>dp[i])
                {
                    dp[i]=1+dp[prev];
                    hash[i]=prev;
                }
            }
            if(dp[i]>max)
            {
                max=dp[i];
                lastindex=i;
            }
        }
        ArrayList<Integer> al=new ArrayList<>();
        int ans[]=new int[max];
        ans[0]=nums[lastindex];
        int index=1;
        while(hash[lastindex]!=lastindex)
        {
            lastindex=hash[lastindex];
            ans[index]=nums[lastindex];
            index++;
        }
        for(int i=ans.length-1;i>=0;i--)
            al.add(ans[i]);
        
        return al;
    }
}