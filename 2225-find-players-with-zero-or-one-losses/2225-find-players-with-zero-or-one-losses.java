class Solution {
    public List<List<Integer>> findWinners(int[][] a) {
        	HashMap<Integer,Integer> hm=new HashMap<>();
		
			for(int i[]:a)
		{
			hm.put(i[1], hm.getOrDefault(i[1], 0)+1);
		}
		ArrayList<Integer> al=new ArrayList<>();
		for(int i[]:a)
		{
			if(hm.get(i[1])==1)
				al.add(i[1]);
		}
		Collections.sort(al);
		HashSet<Integer> hm1=new HashSet<>();
		for(int i[]:a)
		{
			if(hm.containsKey(i[0])==false)
				hm1.add(i[0]);
		}
		List<List<Integer>> res=new ArrayList<>();
		ArrayList<Integer> al1=new ArrayList<>(hm1);
		Collections.sort(al1);
		res.add(al1);
		res.add(al);
        return res;
    }
}