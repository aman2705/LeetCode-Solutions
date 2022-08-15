class Solution {
    public int edgeScore(int[] edges) {
        
        ArrayList<ArrayList<Integer>> al=new ArrayList<>(edges.length+1);
        
        for(int i=0;i<=edges.length;i++){
            al.add(new ArrayList<Integer>());
        }
        
        for(int i=0;i<edges.length;i++){
            al.get(edges[i]).add(i);
        }
        // for(int i=0;i<al.size();i++){
        //     System.out.println(al.get(i));
        // }
        long max=-1;
        int val=-1;
        for(int i=0;i<al.size();i++){
            long sum=0;
            for(int j=0;j<al.get(i).size();j++){
                sum=sum+al.get(i).get(j);
            }
            if(max<sum)
            {
                max=sum;
                val=i;
            }
        }        
        return val;
    }
}