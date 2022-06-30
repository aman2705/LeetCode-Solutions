class Solution {
    public double findMedianSortedArrays(int[] arr1, int[] arr2) {
        
       
        if(arr1.length>arr2.length){
            int temp[]=arr1;
            arr1=arr2;
            arr2=temp;
        }
//         System.out.println(Arrays.toString(nums1));
//         System.out.println(Arrays.toString(nums2));
        
       
        int m=arr1.length;
        int n=arr2.length;
        
        int median=((n+m+1)/2);
        
      int low=0,high=m,medianPos=((m+n)+1)/2;
    while(low<=high) {
        int cut1 = (low+high)>>1;
        int cut2 = medianPos - cut1;
        
        int l1 = (cut1 == 0)? Integer.MIN_VALUE:arr1[cut1-1];
        int l2 = (cut2 == 0)? Integer.MIN_VALUE:arr2[cut2-1];
        int r1 = (cut1 == m)? Integer.MAX_VALUE:arr1[cut1];
        int r2 = (cut2 == n)? Integer.MAX_VALUE:arr2[cut2];
        
        if(l1<=r2 && l2<=r1) {
            if((m+n)%2 != 0)
                return Math.max(l1,l2);
            else 
                return (Math.max(l1,l2)+Math.min(r1,r2))/2.0;
        }
        else if(l1>r2) high = cut1-1;
        else low = cut1+1;
    }
    return 0.0;
        
    }
}