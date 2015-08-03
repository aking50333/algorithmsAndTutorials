package LinkedList.SumNumbers;

/**
 * Created by Ruben on 6/20/2015.
 */
public class Node {

    private Node next;
    private int value;

    public Node(int value) {
        this.next = null;
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        findLast(this).next = next; ;
    }

    private Node findLast(Node node){
        while(node.next != null)
            node = node.getNext();
        return node;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
