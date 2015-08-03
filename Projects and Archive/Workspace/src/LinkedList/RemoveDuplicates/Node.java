package LinkedList.RemoveDuplicates;

/**
 * Created by Ruben on 6/20/2015.
 */
public class Node {
    Node next;
    int value;

    public Node(int value) {
        this.value = value;
        this.next = null;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
