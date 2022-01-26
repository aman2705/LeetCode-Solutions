class Solution {
    public void rotate(int[] nums, int k) {
      
        if(nums.length==1)
        {
            return;
        }
        if(nums.length<k)
        {
            k=k%nums.length;
        }
        int temp[]=new int[nums.length-k];
        for(int i=0;i<temp.length;i++)
        {
            temp[i]=nums[i];
        }
        int space[]=new int[k];
        for(int i=0;i<space.length;i++)
        {
            space[i]=nums[nums.length-k+i];
        }
        int ans[]=new int[space.length+temp.length];
        for(int i=0;i<space.length;i++)
        {
            ans[i]=space[i];
        }
        for(int i=0;i<temp.length;i++)
        {
            ans[space.length+i]=temp[i];
        }
       for(int i=0;i<ans.length;i++)
       {
           nums[i]=ans[i];
       }
    }  
}