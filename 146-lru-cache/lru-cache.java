class Node {
    int val,key;
    Node prev;
    Node next;

    Node(int key, int val) {
        this.key = key;
        this.val = val;
    }
}

class LRUCache {
    HashMap<Integer, Node> map;
    int capacity = 0;
    Node head;
    Node tail;

    public LRUCache(int _capacity) {
        map = new HashMap<>();
        capacity = _capacity;
        head = new Node(0,0);
        tail = new Node(0,0);
        head.next = tail;
        tail.prev = head;

    }

    public void remove(Node node){
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    public void insert(Node node){
        node.next = head.next;
        node.prev = head;
        head.next.prev = node;
        head.next = node;
    }

    public int get(int key) {
        if(map.containsKey(key)){
            Node temp = map.get(key);
            remove(temp);
            insert(temp);
            return temp.val;
        }
        return -1;
    }

    public void put(int key, int value) {
        if(map.containsKey(key)){
            Node exist = map.get(key);
            exist.val = value;
            remove(exist);
            insert(exist);

        }else {
            if(capacity == map.size()){
                Node lru = tail.prev;
                remove(lru); 
                map.remove(lru.key);
            }

           Node newnode = new Node(key,value);
           insert(newnode);
           map.put(key,newnode);
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */