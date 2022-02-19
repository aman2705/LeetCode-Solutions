class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int j=-1;
        int sum=0;
        hm.put(sum,j);
        int ans=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)
                nums[i]=-1;
        }
        while(j<nums.length-1)
        {
            j++;
            sum=sum+nums[j];
            if(hm.containsKey(sum))
            {
                int len=j-hm.get(sum);
                if(ans<len)
                    ans=len;
            }
            else
            {
                hm.put(sum,j);
            }

        }
        return ans;
    }
}