class LFUCache {

    int currsize;
    final int capacity;
    int minfreq;
    HashMap<Integer,DLLnode> cache;
    HashMap<Integer,DoubleLinkedList> freqmap;
    
    public LFUCache(int capacity) {
        
        this.currsize=0;
        this.capacity=capacity;
        this.minfreq=0;
        this.cache=new HashMap<>();
        this.freqmap=new HashMap<>();
        
    }
    
    public int get(int key) {
        
        DLLnode currnode=cache.get(key);
        if(currnode==null){
            return -1;
        }
        update(currnode);
        return currnode.val;
    }
    
    public void put(int key, int value) {
        if(capacity==0){
            return;
        }
        
        if(cache.containsKey(key)){
            
            DLLnode currnode=cache.get(key);
            currnode.val=value;
            update(currnode);
            
        }
        else{
            currsize++;
            if (currsize > capacity) {
               
                DoubleLinkedList minFreqList = freqmap.get(minfreq);
                cache.remove(minFreqList.tail.prev.key);
                minFreqList.removenode(minFreqList.tail.prev);
                currsize--;
            }
            
            minfreq = 1;
            DLLnode newnode=new DLLnode(key,value);
            DoubleLinkedList currlist=freqmap.getOrDefault(1,new DoubleLinkedList());
            
            currlist.addnode(newnode);
            freqmap.put(1,currlist);
            cache.put(key,newnode);
            
        }
        
    }
    public void update(DLLnode currnode){
        
        int freq=currnode.freq;
        DoubleLinkedList curr=freqmap.get(freq);
        curr.removenode(currnode);
        
         if(freq == minfreq && curr.listsize == 0) {
            minfreq++;
        }
        
        currnode.freq++;
        DoubleLinkedList newlist=freqmap.getOrDefault(currnode.freq,new DoubleLinkedList());
        newlist.addnode(currnode);
        freqmap.put(currnode.freq,newlist);
    }
}
class DLLnode{
    int key;
    int val;
    int freq;
    DLLnode prev;
    DLLnode next;
    public DLLnode(int key,int val){
        this.key=key;
        this.val=val;
        this.freq=1;
    }
}
class DoubleLinkedList{
    int listsize;
    DLLnode head;
    DLLnode tail;
    public DoubleLinkedList(){
        this.listsize=0;
        this.head=new DLLnode(0,0);
        this.tail=new DLLnode(0,0);
        head.next=tail;
        tail.prev=head;
    }
    public void addnode(DLLnode currnode){
        
        DLLnode node=head.next;
        
        currnode.next=node;
         currnode.prev=head;
        head.next=currnode;
        node.prev=currnode;
        
       
        
        listsize++;
    }
    public void removenode(DLLnode currnode){
        currnode.next.prev=currnode.prev;
        currnode.prev.next=currnode.next;
        listsize--;
    }
}

/**
 * Your LFUCache object will be instantiated and called as such:
 * LFUCache obj = new LFUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */