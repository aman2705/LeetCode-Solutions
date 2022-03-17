class Solution {
    public int triangleNumber(int[] arr) {
        
        Arrays.sort(arr);
        int count=0;
        for(int i=arr.length-1;i>=2;i--)
        {
            int low=0;
            int high=i-1;
            while(low<high)
            {
                if(arr[low]+arr[high]>arr[i])
                {
                    count=count+(high-low);
                    high--;
                }
                else
                {
                    low++;
                }
            }
        }
        return count;
    }
}