class Solution {
    public int minOperations(int[] nums, int[] numsDivide) {
        
       
        Arrays.sort(numsDivide);
        int result=numsDivide[0];
        for(int i=1;i<numsDivide.length;i++){
            
            result=gcd(numsDivide[i],result);
            
            if(result==1)
                break;
        }
         // System.out.println(result);
        Arrays.sort(nums);
        int i=0;
        for(i=0;i<nums.length;i++){
            if(result%nums[i]==0)
                break;
        }
        
        if(i==nums.length)
            return -1;
        
        return i-0;
        
    }
    private static int gcd(int a,int b){
        if(b==0)
            return a;
        
        return gcd(b,a%b);
    }
}