import java.util.*;

class LRUCache {

    public static class ListNode{
        int key;
        int value;
        ListNode prev;
        ListNode next;
        
        ListNode(int key, int value){
            this.key=key;
            this.value=value;
        }
        
    }
    
    HashMap<Integer,ListNode> map;
    int limit=0;
    
    ListNode head;
    ListNode tail;
    int size;
    
    public LRUCache(int capacity) {
        limit=capacity;
        map=new HashMap<>();
    }
    
    
    public int get(int key) {
        if(!map.containsKey(key)){
            return -1;
        }else{
            ListNode node=map.get(key);
            
            remove(node);
            addLast(node);
            return node.value;
        }
    }
    
    public void put(int key, int value) {
        if(!map.containsKey(key)){
            ListNode newNode=new ListNode(key,value);
            addLast(newNode);
            map.put(key,newNode);
            
            if(size>limit){
                int remKey=removeFirst();
                map.remove(remKey);
            }
        }else{
            ListNode node=map.get(key);
            
            remove(node);
            addLast(node);
            
            //update value
            node.value=value;
        }
    }
    
    private void addLast(ListNode newNode){
        if(size==0){
            head=tail=newNode;
        }else{
            tail.next=newNode;
            newNode.prev=tail;
            tail=newNode;
        }
        size++;
    }
    
    private void remove(ListNode node){
        if(node==head){
            removeFirst();
    
        }else if(node==tail){
            removeLast();
        }else{
        
            ListNode pn = node.prev;
            ListNode fn = node.next;

            pn.next = fn;
            fn.prev = pn;

            node.next = node.prev = null;
            size--;
        }
    }
    
    private void removeLast(){
        if(size==0){
            return;
        }else if(size==1){
            int key=head.key;
            head=tail=null;
            size--;
        }else{
            int key=head.key;
            ListNode newTail=tail.prev;
            
            newTail.next=null;
            tail.prev=null;
            
            tail=newTail;
            size--;
        }
    }
    
    private int removeFirst(){
        if(size==0){
            return -1;
        }
        
        int key=head.key;
        if(size==1){
            head=tail=null;
        }else{
            ListNode newHead=head.next;
            
            head.next=null;
            newHead.prev=null;
            
            head=newHead;
        }
        size--;
        return key;
    }
    
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */