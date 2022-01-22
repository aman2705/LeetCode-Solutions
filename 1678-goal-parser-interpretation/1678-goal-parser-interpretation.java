class Solution {
    public String interpret(String command) {
        StringBuilder sb=new StringBuilder();
        
        for(int i=0;i<command.length()-1;i++)
        {
            char ch=command.charAt(i);
            char ch1=command.charAt(i+1);
            int ascii=ch;
            int ascii1=ch1;
            
            if(ascii==40 && ascii1==41)
            {
                sb.append('o');
            }
            else {
                if(ascii>=65 && ascii<=90)
                {
                    sb.append(ch);
                }
                else if(ascii>=97 && ascii<=122)
                {
                    sb.append(ch);
                }
            }
            
        }
        char ch=command.charAt(command.length()-1);
        int ascii=ch;
        if(ascii>=65 && ascii<=90 || ascii>=97 && ascii<=122)
        {
            sb.append(ch);
        }
        return sb.toString();
    }
}