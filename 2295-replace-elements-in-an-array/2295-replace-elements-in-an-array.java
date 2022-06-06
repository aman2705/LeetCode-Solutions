class Solution {
    public int[] arrayChange(int[] nums, int[][] operations) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++)
            hm.put(nums[i],i);
        
        for(int a[]:operations)
        {
            int old_v=a[0];
            int new_v=a[1];
            int index=hm.get(old_v);
            nums[index]=new_v;
            hm.put(new_v,index);
        }
        return nums;
    }
}