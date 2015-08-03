package LinkedList.ReverseLinkedList;

/**
 * Created by Ruben on 6/22/2015.
 */
public class ReverseLinkedList1 {

    public static void main(String[] args) {

        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        Node node7 = new Node(7);
        Node node8 = new Node(8);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = node8;

        Node result = reverseList(node1);

        while(result != null){
            System.out.println(result.value);
            result = result.next;
        }

    }

    public static Node reverseList(Node node){
        Node result, current;
        Node nextNode = null;

        while(node != null && node.next != null){
            current = node.next;
            node.next = nextNode;
            nextNode = node;
            node = current;
        }


        node.next =nextNode;
        result = node;

        return result;
    }
}
