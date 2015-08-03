package LinkedList.SwapElements;

/**
 * Created by Ruben on 6/21/2015.
 */
public class SwapElements {

    public static void main(String[] args) {
        Node node1 = new Node(2);
        Node node2 = new Node(1);
        Node node3 = new Node(4);
        Node node4 = new Node(3);
//        Node node5 = new Node(6);
//        Node node6 = new Node(5);
//        Node node7 = new Node(8);
//        Node node8 = new Node(7);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
//        node4.next = node5;
//        node5.next = node6;
//        node6.next = node7;
//        node7.next = node8;

        Node result = swapElements(node1);

        while(result!= null){
            System.out.println(result.value);
            result = result.next;
        }
    }

    public static Node swapElements(Node node){
        Node result = node;
        Node current, prev =null;

        if (node != null && node.next != null){
            current = node.next;
            node.next = current.next;
            current.next = node;
            result = current;
            prev = current.next;
            node = node.next;
        }

        while(node != null && node.next != null){
            current = node.next;
            node.next = current.next;
            current.next = node;
            prev.next = current;
            prev = current.next;
            node = node.next;
        }
        return result;
    }
}
