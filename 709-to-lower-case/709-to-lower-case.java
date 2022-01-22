class Solution {
    public String toLowerCase(String s) {
        // s=s.toLowerCase();
        // return s;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            int ascii=ch;
            if(ascii>=65 && ascii<=90)
            {
                ascii=ascii+32;
            }
            ch=(char) ascii;
            sb.append(ch);
        }
        return sb.toString();
    }
}