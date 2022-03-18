class Solution {
    public String largestNumber(int[] nums) {
        String a[]=new String[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            a[i]=nums[i]+"";
        }
        Arrays.sort(a,(b,c)->{
            long n1=Long.parseLong(b+c);
            long n2=Long.parseLong(c+b);
            if(n1>n2)
                return 1;
            else
                return -1;
        });
        StringBuilder sb=new StringBuilder();
        for(int i=a.length-1;i>=0;i--)
        {
            sb.append(a[i]);
        }
        while(sb.toString().charAt(0)=='0' && sb.length()>1)
        {
            sb.deleteCharAt(0);
        }
        return sb.toString();
    }
}