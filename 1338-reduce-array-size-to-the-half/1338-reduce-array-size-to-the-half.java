class Solution {
    public int minSetSize(int[] arr) {
        
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<arr.length;i++)
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        
        ArrayList<Integer> al=new ArrayList<>();
        
        for(Integer i:hm.keySet())
            al.add(hm.get(i));
        
        Collections.sort(al);
        int len=arr.length;
        int i=al.size()-1;
        int count=0;
        
        while(len>arr.length/2)
        {
            len=len-al.get(i);
            i--;
            count++;
            if(len<arr.length/2)
                break;
        }
        return count;
    }
}