package WordLadder;

import java.util.ArrayList;

/**
 * Created by Ruben on 6/16/2015.
 */
public class WordLadder {

    public static void main (String args []){

        String start = "hit";
        String end = "cog";

        String [] dict = {"hot","dot","dog","lot","log"};

        System.out.println(ladderLength(start, end, dict));

    }

    public static int ladderLength (String start, String end, String [] dict) {
        Node [] nodes = new Node[dict.length];

        Node source = null;
        Node target = null;

        for (int i =0; i<dict.length; i ++){
            nodes[i] = new Node(dict[i]);
            if(dict[i].equals(start))
                source = nodes[i];
            if(dict[i].equals(end))
                target = nodes[i];
        }

        for (int i =0; i<nodes.length-1; i++){
            for (int j = i+1; j<nodes.length; j++)
                if (isAdjacent(nodes[i], nodes[j])){

                    nodes[i].getAdjacent().add(nodes[j]);
                    nodes[j].getAdjacent().add(nodes[i]);
                }
        }

        return runDijkstraOnNodes(nodes, source, target);
    }

    public static int runDijkstraOnNodes(Node[] nodes, Node source, Node target){
        /**
         * Here must be the implementation of  Dijkstra's algorithm for nodes
         */
        return 0;
    }

    public static boolean isAdjacent(Node node1, Node node2){
        int counter = 0;
        for (int i =0 ; i < node1.getValue().length(); i++)
            if (node1.getValue().charAt(i) != node2.getValue().charAt(i))
                counter ++;

        if (counter == 1)
            return true;
        return false;
    }

    public static class Node{
        private String value;
        private boolean visited;
        private ArrayList<Node> adjacent;

        public Node(String value) {
            this.value = value;
            this.visited = false;
            this.adjacent = new ArrayList<Node>();
        }

        public String getValue() {
            return value;
        }
        public void setValue(String value) {
            this.value = value;
        }
        public boolean isVisited() {
            return visited;
        }
        public void setVisited(boolean visited) {
            this.visited = visited;
        }
        public ArrayList<Node> getAdjacent() {
            return adjacent;
        }
        public void setAdjacent(ArrayList<Node> adjacent) {
            this.adjacent = adjacent;
        }
    }
}
