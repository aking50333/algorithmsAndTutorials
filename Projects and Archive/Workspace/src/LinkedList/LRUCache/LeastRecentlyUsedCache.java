package LinkedList.LRUCache;

import MergeIntervals.MergeIntervals;

import java.util.HashMap;
import java.util.Iterator;

/**
 * Created by Ruben on 6/21/2015.
 */
public class LeastRecentlyUsedCache {


    HashMap<Integer, Node> map;
    Node start;
    private int counter =0;
    private final int capacity = 8;

    public LeastRecentlyUsedCache() {
        this.map = new HashMap<Integer, Node>();
        this.start = null;
    }

    public void set(int key, int value){
        if (start == null){
            start = new Node(key, value);
            map.put(key, start);
            counter ++;
        }

        else if (this.map.get(key)== null){
            Node newNode = new Node(key, value);
            if (isFull()){
                removeLast();
            }
            newNode.next = start;
            start.prev = newNode;
            start = newNode;
            map.put(key, start);
            counter ++;
        }
    }

    private boolean isFull(){
        if (counter < capacity)
            return false;
        else
            return true;

    }

    private void removeLast(){
        Node iterator = start;
        while(iterator.next != null){
            iterator = iterator.next;
        }

        map.remove(iterator.key);

        iterator.prev.next = null;
    }

    public int get(int key){

        Node node = this.map.get(key);
        if (node == null)
            return -1;

        // remove null pointer exception
        if(node.prev == null)
            return  node.value;

        if (node.next == null)
            node.prev.next = null;
        else{
            node.prev.next = node.next;
            node.next.prev = node.prev;
        }

        node.prev = null;
        node.next = start;
        start = node;
        return start.value;

    }
}
