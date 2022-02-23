class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        int count=0;
        int target=0;
        HashMap<Integer,Integer> hm=new HashMap();
        for(int num:nums1)
        {
            for(int num2:nums2)
            {
                hm.put(num+num2,hm.getOrDefault(num+num2,0)+1);
            }
        }
        for(int num3:nums3)
        {
            for(int num4:nums4)
            {
                count=count+hm.getOrDefault(target-(num3+num4),0);
            }
        }
        return count;
        
    }
}