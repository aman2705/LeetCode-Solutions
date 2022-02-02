class Solution {
    public String smallestSubsequence(String s) {
                int freq[]=new int[26];
        boolean exist[]=new boolean[26];
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            int ascii=ch;
            freq[ascii-'a']++;
        }
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            int ascii=ch;
            freq[ch-'a']--;
            if(exist[ascii-'a']==true)
            {
                continue;
            }
            while(!st.isEmpty() && freq[st.peek()-'a']>0 && st.peek()>ch)
            {
                char ch1=st.pop();
                exist[ch1-'a']=false;
            }
            st.push(ch);
            exist[ch-'a']=true;
            
        }
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}