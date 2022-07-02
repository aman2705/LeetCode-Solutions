class Solution {
    public int search(int[] nums, int target) {
        
        
        int ind=findMin(nums);
        int start=0;
        int end=nums.length-1;
        
        if(target>=nums[ind] && target<=nums[end]){
            start=ind;
        }
        else{
            end=ind-1;
        }
        
        while(start<=end){
            
             int mid=(start+(end-start)/2);
            
            if(nums[mid]==target)
                return mid;
            
            else if(nums[mid]<target)
                start=mid+1;
            
            else
                end=mid-1;
        }
        return -1;
        
    }
    public int findMin(int[] nums) {
        
        int start=0;
        int end=nums.length-1;
        while(start<end){
            int mid=(start+(end-start)/2);
            if(nums[mid]>nums[end])
                start=mid+1;
            else
                end=mid;
        }
        return end;
    }
}