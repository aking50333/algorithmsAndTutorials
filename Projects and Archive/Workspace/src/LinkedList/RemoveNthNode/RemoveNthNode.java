package LinkedList.RemoveNthNode;

/**
 * Created by Ruben on 6/22/2015.
 */
public class RemoveNthNode {

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

        int number = 1;
        Node result = removeNode(node1, number);

        while(result != null){
            System.out.println(result.value);
            result = result.next;
        }
    }

    public static Node removeNode(Node node, int number){
        int size =0;
        if (node == null){
            return node;
        }
        Node iterator = node;
        while (iterator != null){
            size ++;
            iterator = iterator.next;
        }

        if (size == 0 || size < number)
            return node;
        if (number == size)
            return node.next;

        Node result = node;


        int i =1;
        while (i!= size - number){
            i ++;
            node = node.next;
        }

        node.next = node.next.next;

        return result;


    }
}
