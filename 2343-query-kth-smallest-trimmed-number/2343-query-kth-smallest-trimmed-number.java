class Solution {
    public int[] smallestTrimmedNumbers(String[] nums, int[][] queries) {
     
        
        String temp[]=new String[nums.length];
        for(int i=0;i<temp.length;i++){
            temp[i]=nums[i];
        }
        boolean b=true;
        int res[]=new int[queries.length];
        int index=0;
        for(int a[]:queries){
            
            
            int small=a[0];// which number is smallest
            int trim=a[1];// upto which digit we have to trim
    
            reverse(nums);
            
            String ans[]=new String[nums.length];
            
            for(int i=0;i<nums.length;i++){
                ans[i]=nums[i].substring(0,trim);
            }
            
            reverse(ans);
//             if(index==9)
//                 System.out.println(Arrays.toString(ans));
            
            reverse(nums);
            PriorityQueue<String[]> pq=new PriorityQueue<>(new maxComparator());
            for(int i=0;i<ans.length;i++){
                pq.add(new String[]{i+"",ans[i]});
                if(pq.size()>small)
                    pq.poll();
            }
           
           
           
            res[index++]=Integer.parseInt(pq.peek()[0]);
            
        }
        return res;
    }
    private static void reverse(String nums[]){
        
        for(int i=0;i<nums.length;i++){
            StringBuilder sb=new StringBuilder(nums[i]);
            nums[i]=sb.reverse().toString();
        }
    }
}

class maxComparator implements Comparator<String []>{
    
    
    public int compare(String s1[], String[] s2) {
            
        if(!s2[1].equals(s1[1])){
            if(s2[1].compareTo(s1[1])>0)
                return 1;
            else
                return -1;
                
        }
        else{
           int index1=Integer.parseInt(s1[0]);
           int index2=Integer.parseInt(s2[0]);
           if(index2>index1)
        	   return 1;
           else
        	   return -1;
        }
        
        }
}