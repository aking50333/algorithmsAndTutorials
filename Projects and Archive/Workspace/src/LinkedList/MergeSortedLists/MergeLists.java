package LinkedList.MergeSortedLists;

/**
 * Created by Ruben on 6/20/2015.
 */
public class MergeLists {

    public static void main(String[] args) {

        Node list1 = new Node(1);
        Node list2 = new Node(2);
        Node list3 = new Node(3);
        Node list4 = new Node(4);
        Node list5 = new Node(5);
        Node list6 = new Node(6);
        list1.setNext(list3);
        list3.setNext(list5);
        list2.setNext(list4);
        list4.setNext(list6);
        Node result = mergeLists(list1, list2);

        while (result != null){
            System.out.println(result.getValue());
            result = result.getNext();

        }

    }

    public static Node mergeLists(Node list1, Node list2){
        if (list1 == null)
            return list2;
        if (list2 == null)
            return list1;

        Node result;

        if(list1.getValue() < list2.getValue()){
            result = new Node(list1.getValue());
            list1 = list1.getNext();
        }else{
            result = new Node(list2.getValue());
            list2 = list2.getNext();
        }
        Node head = result;
        while(list1 != null && list2 !=null){
            if (list1.getValue() < list2.getValue()){
                result.setNext(list1);
                list1 = list1.getNext();
            }else{
                result.setNext(list2);
                list2 = list2.getNext();
            }
            result = result.getNext();
            //result.setNext(null);
        }
        if (list1 != null){
            result.setNext(list1);
        }
        if (list2 != null){
            result.setNext(list2);
        }
        return head;
    }
}
