class Solution {
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);
        
        int maxh=Math.max(horizontalCuts[0]-0,h-horizontalCuts[horizontalCuts.length-1]);
        int maxv=Math.max(verticalCuts[0]-0,w-verticalCuts[verticalCuts.length-1]);
        
        for(int i=1;i<horizontalCuts.length;i++){
            int height=horizontalCuts[i]-horizontalCuts[i-1];
            maxh=Math.max(maxh,height);
        }
        
        for(int i=1;i<verticalCuts.length;i++){
            int ver=verticalCuts[i]-verticalCuts[i-1];
            maxv=Math.max(ver,maxv);
        }
        
        long ans=((1L * maxh * maxv) % 1000000007);
        return (int) ans;
    }
}