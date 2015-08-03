package LinkedList.Cycle;

/**
 * Created by Ruben on 6/20/2015.
 */
public class Node {
    Node next;

    public Node getNext() {
        return next;
    }

    public Node findLast(){
        Node node =this;
        while(node.next != null)
            node = node.getNext();
        return node;
    }

    public void setNext(Node next) {
        findLast().next = next; ;
    }
}
