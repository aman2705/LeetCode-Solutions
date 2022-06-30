class FreqStack {

    List<Stack<Integer>> al;
    HashMap<Integer,Integer> hm;
    public FreqStack() {
        this.al=new ArrayList<>();
        this.hm=new HashMap<>();
    }
    
    public void push(int val) {
        
        hm.put(val,hm.getOrDefault(val,0)+1);
        int freq=hm.get(val);
        if(freq-1>=al.size()){
            al.add(new Stack<Integer>());
        }
        al.get(freq-1).add(val);
    }
    
    public int pop() {
        
        int x=al.get(al.size()-1).pop();
        if(al.get(al.size()-1).isEmpty()){
            al.remove(al.size()-1);
        }
        int freq=hm.get(x);
        if(freq-1!=0)
            hm.put(x,freq-1);
        else
            hm.remove(x);
        
        return x;
    }
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */