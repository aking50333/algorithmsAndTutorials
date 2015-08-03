package LinkedList.SumNumbers;

/**
 * Created by Ruben on 6/20/2015.
 */
public class LinkedListSumNumbers {

    public static void main(String args []){
        Node list1 = new Node(2);
        for (int i =4; i<8; i+=2)
            list1.setNext(new Node(i));

        Node list2 = new Node(3);
        for (int i =5; i<8; i+=2)
            list2.setNext(new Node(i));

        Node result = sumNumbers(list1, list2);

        while(result != null){
            System.out.println(result.getValue());
            result = result.getNext();
        }
    }

    public static Node sumNumbers(Node list1, Node list2){
        int a = 0 ;
        int b = 0 ;
        int counter = 1;

        while(list1 != null){
            a = a + counter * list1.getValue();
            list1 = list1.getNext();
            counter = counter * 10;
        }

        counter = 1;
        while(list2 != null){
            b = b + counter * list2.getValue();
            list2 = list2.getNext();
            counter = counter * 10;
        }

        int sum = a +b;



        Node result = new Node(sum%10);
        sum = sum/10;

        while(sum != 0){
            result.setNext(new Node(sum%10));
            sum = sum/10;
        }

        return result;
    }

}
