package LinkedList.RemoveElement;

/**
 * Created by Ruben on 6/21/2015.
 */
public class RemoveElement {
    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(1);
        Node node4 = new Node(4);
        Node node5 = new Node(1);
        Node node6 = new Node(2);
        Node node7 = new Node(1);
        Node node8 = new Node(3);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = node8;

        int value = 1;

        Node result = removeValue(node1, value);

        while(result!= null){
            System.out.println(result.value);
            result = result.next;
        }
    }

    public static Node removeValue(Node node1, int value){
        if (node1 == null)
            return node1;

        while(node1.value == value)
            node1 = node1.next;

        Node result =  node1;


        while(node1 != null){
            if (node1.next != null && node1.next.value == value){
                node1.next = node1.next.next;
            }else
                node1 = node1.next;
        }
        return result;

    }
}
