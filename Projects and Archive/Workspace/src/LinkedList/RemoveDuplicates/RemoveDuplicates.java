package LinkedList.RemoveDuplicates;

/**
 * Created by Ruben on 6/20/2015.
 */
public class RemoveDuplicates {

    public static void main (String args[]){
        Node list1 = new Node(1);
        Node list2 = new Node(2);
        Node list3 = new Node(2);
        Node list4 = new Node(2);
        Node list5 = new Node(3);
        Node list6 = new Node(4);
        Node list7 = new Node(5);
        Node list8 = new Node(5);
        Node list9 = new Node(6);
        list1.setNext(list2);
        list2.setNext(list3);
        list3.setNext(list4);
        list4.setNext(list5);
        list5.setNext(list6);
        list6.setNext(list7);
        list7.setNext(list8);
        list8.setNext(list9);

//        Node result = removeDuplicates(list1);
        Node result = removeAllDuplicates(list1);


        while(result != null){
            System.out.println(result.getValue());
            result = result.getNext();
        }

        System.out.println("Finish");


    }


    public static Node removeAllDuplicates(Node list){

        Node t = new Node(0);
        t.next = list;

        Node p = t;
        while(p.next!=null && p.next.next!=null){

            if(p.next.value == p.next.next.value){

                int value = p.next.value;

                while(p.next!=null && p.next.value == value){
                    p.next = p.next.next;
                }

            }else{
                p = p.next;
            }

        }

        return t.next;

    }

    public static Node removeDuplicates(Node list){
        Node result = list;

        while(list.getNext() != null && list.getValue() == list.getNext().getValue()){
            list.setNext(list.getNext().getNext());
            if (list.getValue() != list.getNext().getValue())
                list = list.getNext();
        }

        return result;
    }

}
