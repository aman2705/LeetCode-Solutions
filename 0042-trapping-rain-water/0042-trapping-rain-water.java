class Solution {
    public int trap(int[] a) {
       
        int left[]=new int[a.length];// left
        int right[]=new int[a.length];// right
        left[0]=0;
        int maxleft=a[0];
        for(int i=1;i<a.length;i++){
            left[i]=maxleft;
            maxleft=Math.max(a[i],maxleft);
        }
        right[a.length-1]=0;
        int maxright=a[a.length-1];
        for(int i=a.length-2;i>=0;i--){
            right[i]=maxright;
            maxright=Math.max(a[i],maxright);
        }
        
        // System.out.println(Arrays.toString(left));
        // System.out.println(Arrays.toString(right));
        
        int total=0;
        for(int i=1;i<a.length;i++){
            if(left[i]>a[i] && right[i]>a[i]){
                int min=Math.min(left[i],right[i]);
                int trapped=min-a[i];
                total=total+trapped;
            }
        }
        return total;
    }
}