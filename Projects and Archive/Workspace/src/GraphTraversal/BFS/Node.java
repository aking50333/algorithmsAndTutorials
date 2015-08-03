package GraphTraversal.BFS;

import java.util.ArrayList;

/**
 * Created by Ruben on 6/27/2015.
 */
public class Node {

    private int value;
    private ArrayList<Node> adjacent;
    private String color;

    public Node(int value) {
        this.value = value;
        this.adjacent = new ArrayList<Node>();
        this.color = "red";
    }

    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }
    public ArrayList<Node> getAdjacent() {
        return adjacent;
    }
    public void setAdjacent(ArrayList<Node> adjacent) {
        this.adjacent = adjacent;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
}
