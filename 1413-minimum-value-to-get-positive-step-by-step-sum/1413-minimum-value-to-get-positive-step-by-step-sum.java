class Solution {
    public int minStartValue(int[] nums) {
        
        int sum=0;
        int res=Math.min(nums[0],1);
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            res=Math.min(res,sum);
        }
        
        if(res<0){
            res=(res*-1)+1;
        }
        return res;
        
    }
}