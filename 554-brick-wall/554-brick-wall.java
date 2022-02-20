class Solution {
    public int leastBricks(List<List<Integer>> wall) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        
        for(int i=0;i<wall.size();i++)
        {
            int sum=0;
            for(int j=0;j<wall.get(i).size()-1;j++)
            {
                sum=sum+wall.get(i).get(j);
                hm.put(sum,hm.getOrDefault(sum,0)+1);
            }
        }
        int max=0;
        for(Integer i:hm.keySet())
        {
            if(hm.get(i)>max)
                max=hm.get(i);
        }
        return wall.size()-max;
    }
}