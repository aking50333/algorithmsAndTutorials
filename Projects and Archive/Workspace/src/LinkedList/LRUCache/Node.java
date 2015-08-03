package LinkedList.LRUCache;

/**
 * Created by Ruben on 6/21/2015.
 */
public class Node {

    int value;
    int key;
    Node next;
    Node prev;

    public Node(int key, int value) {
        this.key = key;
        this.value = value;
        this.next = null;
        this.prev = null;
    }
}
