class Solution {
    public int[] sortArrayByParityII(int[] nums) {
         ArrayList<Integer> even=new ArrayList<>();
        ArrayList<Integer> odd=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0)
                even.add(nums[i]);
            else
                odd.add(nums[i]);
        }
        int start=0;
        int end=0;
        for(int i=0;i<nums.length;i++){
             if(i%2==0)
             {
                 nums[i]=even.get(start);
                 start++;
             }
            else
            {
                nums[i]=odd.get(end);
                end++;
            }
        }
        return nums;
    }
}