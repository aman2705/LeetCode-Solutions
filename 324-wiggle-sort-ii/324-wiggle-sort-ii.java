class Solution {
    public void wiggleSort(int[] nums) {
        
        if(nums.length==1)
            return;
        
        int ans[]=nums.clone();;
        Arrays.sort(ans);
        // System.out.println(Arrays.toString(ans));
        Arrays.fill(nums,0);
        int i=1;
        int end=ans.length-1;
        while(i<ans.length){
            
            // System.out.println(ans[end]);
            nums[i]=ans[end];
            end--;
            i=i+2;
            
            if(end==-1)
                break;
            
            
            if(i>=ans.length)
                i=0;
        }
    }
}