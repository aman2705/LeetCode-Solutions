class Solution {
    public int[] sortArrayByParity(int[] nums) {
     ArrayList<Integer> even=new ArrayList<>();
        ArrayList<Integer> odd=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0)
                even.add(nums[i]);
            else
                odd.add(nums[i]);
        }
        ArrayList<Integer> al=new ArrayList<>();
        if(even.size()>0)
        {
            for(int i=0;i<even.size();i++)
            {
               al.add(even.get(i));
            }
        }
        
        if(odd.size()>0)
        {
            int start=0;
            for(int i=0;i<odd.size();i++)
            {
                 al.add(odd.get(i));
            }
        }
        for(int i=0;i<nums.length;i++)
            nums[i]=al.get(i);
        
        return nums;
    }
}