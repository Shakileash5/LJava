package com.mycompany.app;

/**
 * Custom implementation of hashmap, this implementation provides all of the hashmap operations
 * the table is divided into buckets, each bucket is a linked list.
 * the table is resized when the load factor is greater than 0.75(default)
 * 
 * @author Shakileash
 */
public class CustHashMap<K,V> {
    
    public final int INITIAL_CAPACITY = 16; // initial capacity of the hashmap
    public final float LOAD_FACTOR = 0.75f; // load factor of the hashmap, this factor is used to determine when to resize the hashmap

    private int size;
    private int capacity;

    Node<K,V>[] table; // hashmap table is an array of linked lists

    /**
     * Creates a new hashmap with the initial capacity of 16 and the load factor of 0.75
     */
    public CustHashMap() {
        this.capacity = INITIAL_CAPACITY;
        this.table = new Node[this.capacity];
        this.size = 0;
    }
    
    /**
     * Creates a new hashmap with the given initial capacity and the load factor of 0.75
     * @param capacity - initial capacity of the hashmap
     */
    public CustHashMap(int capacity){
        this.capacity = capacity;
        this.table = new Node[this.capacity];
        this.size = 0;
    }

    /**
     * Linked list node class, this class is used to store the key and value of the hashmap as well as the next node in the linked list
     * 
     */
    static class Node<K,V>{
        private final K key; // key of the node cannot be changed
        private V value; 
        Node<K,V> next;

        /**
         * Creates a new node with the given key and value
         * @param key - key of the node
         * @param value - value of the node
         */
        public Node(K key, V value){
            this.key = key;
            this.value = value;
            this.next = null;
        }

        /**
         * Returns the key of the node
         * @return key - key of the node
         */
        public K getKey(){
            return key;
        }

        /**
         * Returns the value of the node
         * @return value - value of the node
         */
        public V getValue(){
            return value;
        }

        /**
         * Sets the value of the node
         * @param value - value to be set
         * @return oldValue - old value of the node
         */
        public V setValue(V value){
            V oldValue = this.value;
            this.value = value;
            return oldValue;
        }

        /**
         * Checks if the given node is equal to this node
         * @param obj - node to be checked
         * @return true if the given node is equal to this node, false otherwise
         */
        public boolean equals(Node<K,V> obj){
            if(obj == this){
                return true;
            }
            if(obj == null){
                return false;
            }
            if(obj instanceof Node){
                if(obj.getKey() == this.key && obj.getValue() == this.value){
                    return true;
                }
            }
            return false;
        }

        @Override
        public String toString(){
            return this.key + "=" + this.value;
        }

    }

    /**
     * Returns the hash of the given key
     * @param key - key to be hashed
     * @return hash - hash of the key
     */
    private int hash(K key) {
        return Math.abs(key.hashCode() % this.capacity);
    }

    /**
     * Returns the hash of the given key with the given capacity
     * @param key - key to be hashed
     * @param capacity - capacity of the hashmap
     * @return hash - hash of the key
     */
    private int hash(K key, int capacity) {
        return Math.abs(key.hashCode() % capacity);
    }

    /**
     * Inserts the given key and value into the hashmap.
     * @param key - key to be inserted
     * @param value - value to be inserted
     * @return true if the key and value were inserted, false otherwise
     */
    public boolean put(K key, V value){
        if(key == null){
            return false;
        }
        int hash = hash(key);

        // check for collision, if so form a linked list
        if(table[hash] == null){
            table[hash] = new Node<K,V>(key,value);
        }
        else{
            Node<K,V> nodeTemp = table[hash];
            Node<K,V> endNode = null;
            while(nodeTemp != null){
                if(nodeTemp.getKey().equals(key)){ // key already exists
                    nodeTemp.setValue(value);
                    break;
                }
                endNode = nodeTemp;
                nodeTemp = nodeTemp.next;
            }
            if(nodeTemp == null){ // key not found, add to linked list
                endNode.next = new Node<K,V>(key,value);
            }
        }

        size++;
        if(size > capacity*LOAD_FACTOR){ // resize the hashmap if the size is greater than the capacity times the load factor
            resize();
        }
        return true;
    }

    /**
     * Returns the value of the given key, returns {@code null} if the key does not exist.
     * @param key - key to be searched
     * @return value - value of the key
     */
    public V get(K key){
        if(key == null){
            return null;
        }
        int hash = hash(key);
        Node<K,V> headNode = table[hash];
        V value;

        if(headNode == null){
            return null;
        }
        else{
            while(headNode.getKey() != key && headNode != null){ // search for the key
                headNode = headNode.next;
            }
            if(headNode == null){ // key not found
                return null;
            }
            else{
                value = headNode.getValue();
            }
        }
        return value;
    }

    /**
     * Removes the given key from the hashmap.
     * @param key - key to be removed
     * @return value - value of the removed key
     */
    public V remove(K key){
        if(key == null){
            return null;
        }

        int hash = hash(key);
        V oldValue = null;
        Node<K,V> headNode = table[hash];

        if(headNode == null){ // if key not found
            return null;
        }
        else{
            if(headNode.getKey().equals(key)){ // if key is head node
                oldValue = headNode.getValue();
                table[hash] = headNode.next;
            }
            else{
                Node<K,V> nodeTemp = headNode;
                while(nodeTemp.next!=null){
                    if(nodeTemp.next.getKey().equals(key)){ // if key is in linked list, remove the node from linked list
                        oldValue = nodeTemp.next.getValue();
                        nodeTemp.next = nodeTemp.next.next;
                        break;
                    }
                    nodeTemp = nodeTemp.next;
                }
            }
        }
        size--;
        return oldValue;
    }

    /**
     * Resizes the hashmap by doubling the capacity and rehashing all the keys.
     */
    private void resize(){

        int oldCapacity = capacity;
        int newCapacity = capacity*2;
        //this.capacity = newCapacity;
        Node<K,V>[] newTable = new Node[newCapacity]; // new table with double capacity
        int hash;
        for(int i=0; i<oldCapacity;i++){ // go through the old table
            Node<K,V> headNode = table[i];
            if(headNode != null){ // if there is a node in the old table, then traverse the linked list nodes
                Node<K,V> nodeTemp = headNode;
                while(nodeTemp != null){
                    hash = hash(nodeTemp.getKey(),newCapacity);
                    Node<K,V> insertNode = newTable[hash];
                    if(insertNode == null){ // if hash is not present in the table
                        newTable[hash] = new Node<K,V>(nodeTemp.getKey(),nodeTemp.getValue());
                    }
                    else{ // if there is collision, add to linkedlist
                        Node<K,V> endNode = null;
                        while(insertNode!=null){
                            endNode = insertNode;
                            insertNode = insertNode.next;
                        }
                        if(endNode!=null){
                            endNode.next = new Node<K,V>(nodeTemp.getKey(),nodeTemp.getValue());
                        }
                    }
                    nodeTemp = nodeTemp.next;
                }
            }
        }

        // set the new table to the old table
        this.capacity = newCapacity;
        this.table = newTable;
        return;
    }

    @Override
    public String toString(){
        String res = "";

        for(int i=0;i<this.capacity;i++){
            Node<K,V> headNode = this.table[i];

            if(headNode!=null){
                res += "hash:: " + i + " ";
                while(headNode!=null){
                    res += headNode.toString() + " ";
                    headNode = headNode.next;
                }
            }

        }
        return res;
    }

}
