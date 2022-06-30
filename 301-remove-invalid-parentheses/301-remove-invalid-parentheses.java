class Solution {
    public List<String> removeInvalidParentheses(String s) {
        
        // if(s.length()==1 && Character.isAlphabetic(s.charAt(0))){
        //     List<String> res=new ArrayList<>();
        //     res.add(s);
        //     return res;
        // }
        
        List<String> res=new ArrayList<>();
        HashSet<String> hm=new HashSet<>();
        
        int min_removal=min(s);
        make(s,min_removal,hm,res);
        
        return res;
    }
    public static int min(String s){
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            
            
            char ch=s.charAt(i);
            if(ch=='('){
                st.push(ch);
            }
            else if(ch==')'){
                 if(st.size()==0){
                    st.push(ch);
                }
                
                else if(st.peek()=='('){
                    st.pop();
                }
                else if(st.peek()==')'){
                    st.push(ch);
                }
               
            }
            
        }
        return st.size();
    }
    public static void make(String s,int min_r,HashSet<String> hm,List<String> res){
        
        if(hm.contains(s)) return;
            
        hm.add(s);
        
        if(min_r<0){
            return;
        }
        
        if(min_r==0){
            
            int min_rem=min(s);
            if(min_rem==0){
                res.add(s);
            }
            return;   
        }
        
        for(int i=0;i<s.length();i++){
            
            if(s.charAt(i)!='(' && s.charAt(i)!=')') 
                continue;
            
            String left=s.substring(0,i);
            String right=s.substring(i+1);
            
            if(!hm.contains(left+right)){
                 make(left+right,min_r-1,hm,res);
            }
           
        }
    }
}