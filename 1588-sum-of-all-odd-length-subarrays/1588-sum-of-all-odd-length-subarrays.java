class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        
        int n=arr.length;
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        for (int i=0; i <n; i++)
        {
            for (int j=i; j<n; j++)
            {
                ArrayList<Integer> al=new ArrayList<>();
                for (int k=i; k<=j; k++)
                    al.add(arr[k]);
                res.add(al);
            }
        }
        int sum=0;
        for(int i=0;i<res.size();i++)
        {
            if(res.get(i).size()%2==1)
            {
                for(int j=0;j<res.get(i).size();j++)
                    sum=sum+res.get(i).get(j);
            }
        }
        return sum;
}
}