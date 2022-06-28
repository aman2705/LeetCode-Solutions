class LRUCache {

    Node head=new Node(0,0);
    Node tail=new Node(0,0);
    HashMap<Integer,Node> hm=new HashMap<>();
    int capacity;
    public LRUCache(int capacity) {
        this.capacity=capacity;
        head.next=tail;
        tail.prev=head;
    }
    
    public int get(int key) {
        if(hm.containsKey(key)){
            Node node=hm.get(key);
            remove(node);
            insert(node);
            return node.value;
        }
        else{
            return -1;
        }
        
    }
    
    public void put(int key, int value) {
        if(hm.containsKey(key)){
            remove(hm.get(key));
        }
        
        if(hm.size()==capacity){
            remove(tail.prev);
        }
        
        insert(new Node(key,value));
    }
    public void insert(Node node){
        hm.put(node.key,node);
        node.next=head.next;
        node.next.prev=node;
        head.next=node;
        node.prev=head;
        
    }
    public void remove(Node node){
        hm.remove(node.key);
        node.prev.next=node.next;
        node.next.prev=node.prev;
        
    }
}
class Node{
    int key;
    int value;
    Node prev;
    Node next;
    Node(int key,int value){
        this.key=key;
        this.value=value;
        
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */