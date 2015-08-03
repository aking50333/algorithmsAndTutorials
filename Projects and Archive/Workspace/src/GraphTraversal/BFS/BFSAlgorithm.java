package GraphTraversal.BFS;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Ruben on 6/27/2015.
 */
public class BFSAlgorithm {
    public static void main (String args[]){
        Node node = initGraph();
        System.out.println("done");
        traverseBFSGraph(node);


    }


    public static void traverseBFSGraph(Node node){



    }

    public static Node initGraph(){
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        Node node7 = new Node(7);
        Node node8 = new Node(8);
        Node node9 = new Node(9);
        Node node10 = new Node(10);

        node1.getAdjacent().add(node2);
        node1.getAdjacent().add(node9);
        node1.getAdjacent().add(node10);

        node2.getAdjacent().add(node1);
        node2.getAdjacent().add(node3);

        node3.getAdjacent().add(node2);
        node3.getAdjacent().add(node10);
        node3.getAdjacent().add(node4);
        node3.getAdjacent().add(node5);

        node4.getAdjacent().add(node3);
        node4.getAdjacent().add(node5);

        node5.getAdjacent().add(node3);
        node5.getAdjacent().add(node4);
        node5.getAdjacent().add(node6);
        node5.getAdjacent().add(node7);

        node6.getAdjacent().add(node5);
        node6.getAdjacent().add(node7);

        node7.getAdjacent().add(node6);
        node7.getAdjacent().add(node5);
        node7.getAdjacent().add(node8);

        node8.getAdjacent().add(node7);
        node8.getAdjacent().add(node9);
        node8.getAdjacent().add(node10);

        node9.getAdjacent().add(node8);
        node9.getAdjacent().add(node1);

        node10.getAdjacent().add(node1);
        node10.getAdjacent().add(node3);
        node10.getAdjacent().add(node8);

        return node1;
    }

}
