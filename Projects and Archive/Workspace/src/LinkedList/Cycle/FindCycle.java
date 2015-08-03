package LinkedList.Cycle;

/**
 * Created by Ruben on 6/20/2015.
 */
public class FindCycle {
    public static void main(String[] args) {

        Node node = new Node();
        for (int i =0; i< 10; i++)
            node.setNext(new Node());

        node.findLast().setNext(node.getNext().getNext().getNext().getNext().getNext().getNext());

        System.out.println(hasCycle(node));

    }


    public static boolean hasCycle (Node list){
        Node node1 = list;
        Node node2 = list;
        for (;;){
            try{
                node1 = node1.getNext();
                node2 = node2.getNext().getNext();
                if (node1 == node2)
                    return true;
            }catch(Exception e){
                return false;
            }
        }
    }
}
