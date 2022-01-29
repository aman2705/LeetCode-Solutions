class Solution {
    public int getWinner(int[] arr, int k) {
    
        int max=arr[0];
        int count=1;
        for(int i=1;i<arr.length;i++)
        {
            if(max<arr[i])
            {
                max=arr[i];
                count=1;
            }
            if(count++==k)
                break;
        }
        return max;
    }
}