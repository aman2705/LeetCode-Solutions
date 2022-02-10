class Solution {
    public int minSubArrayLen(int k, int[] nums) {
        int i=-1;
        int j=-1;
        int ans=Integer.MAX_VALUE;
        int sum=0;
        while(true)
        {
            boolean a=false;
            boolean b=false;
            while(i<nums.length-1)
            {
                a=true;
                i++;
                sum=sum+nums[i];
                if(sum<k)
                    continue;
                if(sum>=k)
                {
                    int len=i-j;
                    if(ans>len)
                    {
                        ans=len;
                    }
                    break;
                }
                
            }
            while(j<i)
            {
                b=true;
                j++;
                sum=sum-nums[j];
                
                if(sum>=k)
                {
                    int len=i-j;
                    if(ans>len)
                    {
                        ans=len;
                    }
                    
                }
                if(sum<k)
                {
                    break;
                }
                
            }
            if(a==false && b==false)
                break;
            
        }
        if(ans==Integer.MAX_VALUE)
            return 0;
        
        return ans;
        
    }
}