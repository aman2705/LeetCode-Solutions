class Solution {
    public List<String> commonChars(String[] words) {
        
       ArrayList<String> al=new ArrayList<>();
        String str=words[0];
        int count[]=new int[26];
        // for the first word
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            int index=ch-97;
            count[index]++;
        }
        // for the rest of the words
        for(int i=1;i<words.length;i++)
        {
            int count1[]=new int[26];
            String s=words[i];
            for(int j=0;j<s.length();j++)
            {
                char ch=s.charAt(j);
                int index=ch-97;
                count1[index]++;
            }
            for(int k=0;k<count.length;k++)
            {
                count[k]=Math.min(count[k],count1[k]);
            }
        }
        for(int i=0;i<count.length;i++)
        {
            int a=i+97;
            char ch=(char)a;
            int num=count[i];
            while(num>0)
            {
                al.add(""+ch);
                num--;
            }
        }
        
        return al;
    }
}