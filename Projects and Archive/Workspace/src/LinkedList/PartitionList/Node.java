package LinkedList.PartitionList;

/**
 * Created by Ruben on 6/21/2015.
 */
public class Node {

    int value;
    Node next;


    public Node(){
        this.value = -1000;
        this.next = null;
    }

    public Node(int value) {
        this.value = value;
        this.next = null;
    }

    public void addNode(Node node){
        if(this.next == null){
            this.next = node;
            node.next = null;
        }
        else{
            node.next = this.next;
            this.next = node;
        }
    }

    public Node findLast(){
        Node list = this;
        while(list.next!=null){
            list = list.next;
        }
        return list;
    }
}
