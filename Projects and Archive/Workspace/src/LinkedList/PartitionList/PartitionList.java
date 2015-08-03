package LinkedList.PartitionList;

/**
 * Created by Ruben on 6/21/2015.
 */
public class PartitionList {

    public static void main(String[] args) {


        int number = 6;
        Node list1 = new Node(9);
        Node list2 = new Node(8);
        Node list3 = new Node(5);
        Node list4 = new Node(3);
        Node list5 = new Node(7);
        Node list6 = new Node(4);
        Node list7 = new Node(2);
        Node list8 = new Node(1);

        list1.next = list2;
        list2.next = list3;
        list3.next = list4;
        list4.next = list5;
        list5.next = list6;
        list6.next = list7;
        list7.next = list8;


        Node result = partitionList(list1, number);

        while(result != null){
            System.out.println(result.value);
            result = result.next;
        }

    }

    public static Node partitionList(Node list, int number){

        Node list1 = new Node();
        Node list2 = new Node();
        Node nodeik;

        while (list != null){
            if(list.value < number){
                nodeik = list;
                list = list.next;
                list1.addNode(nodeik);
            }
            else{
                nodeik = list;
                list = list.next;
                list2.addNode(nodeik);
            }
        }
        list1.findLast().next = list2.next;
        return list1.next;
    }

}
