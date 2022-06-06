class Solution {
    public int partitionArray(int[] nums, int k) {
        
        Arrays.sort(nums);
        int j=0;
        int i=0;
        int count=0;
//         while(true)
//         {

//             boolean a=false;
//             boolean b=false;
            while(i<nums.length)
            {
                // a=true;
                
                if(nums[i]-nums[j]<=k)
                    i++;
                
                else if(nums[i]-nums[j]>k)
                {
                    count++;
                    j=i;
                }        
            }
        if(i>=nums.length && j<i)
            count++;
        
//             while(j<i)
//             {
                
//                 b=true;
//                 if(i>=nums.length && j<i)
//                     count++;
                    
//                 j=i;
//             }
//             if(a==false && b==false)
//                 break;
        // }
        return count;
    }
    
}