class Solution {
    public int numRabbits(int[] answers) {
        
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<answers.length;i++)
        {
            hm.put(answers[i],hm.getOrDefault(answers[i],0)+1);
        }
        int ans=0;
        for(Integer i:hm.keySet())
        {
            int count=i+1;
            int rabbit=hm.get(i);
            int c=(int)Math.ceil(rabbit*1.0/count*1.0);
            ans=ans+c*count;
        }
        return ans;
    }
}