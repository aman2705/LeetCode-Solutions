class Solution {
    public String reverseVowels(String s) {
        
        ArrayList<Character> al=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            char chr=s.charAt(i);
            int ch=chr;
            if(ch==97 || ch==101 || ch==105 || ch==111 || ch==117 || 
                     ch==65 || ch==69  || ch==73  || ch==79  || ch==85)
            {
                al.add(chr);
            }
        }
        int end=al.size()-1;
        char [] ans=s.toCharArray();
        for(int i=0;i<ans.length;i++){
            char chr=ans[i];
            int ch=chr;
            if(ch==97 || ch==101 || ch==105 || ch==111 || ch==117 || 
                     ch==65 || ch==69  || ch==73  || ch==79  || ch==85)
            {
               ans[i]=al.get(end);
                end--;
            }
        }
        s=String.valueOf(ans);
        return s;
    }
}