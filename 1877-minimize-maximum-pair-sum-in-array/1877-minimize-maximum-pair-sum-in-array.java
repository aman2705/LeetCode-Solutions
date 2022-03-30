class Solution {
    public int minPairSum(int[] nums) {
       
        Arrays.sort(nums);
        ArrayList<int[]> al=new ArrayList<>();
        int  i=0;
        int j=nums.length-1;
        while(i<j)
        {
            al.add(new int[]{nums[i],nums[j]});
            i++;
            j--;
        }
        int max=0;
        for(i=0;i<al.size();i++)
        {
            int res[]=al.get(i);
            
            max=Math.max(max,res[0]+res[1]);
        }
        return max;
    }
}