package BFSTraverse;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    static Scanner input = new Scanner(System.in);
    static int edgeWeight = 6;
    public static void main(String[] args) {
        int numberOfTestCases = input.nextInt();
        for(int i =0 ; i< numberOfTestCases; i++){
            runBFS();
        }
    }

    public static void runBFS(){
        int n = input.nextInt();
        int m = input.nextInt();

        boolean [] visited = new boolean[n];
        int [] distances = new int[n];
        for(int i=0; i< n; i++){
            distances[i] = Integer.MAX_VALUE;
        }

        TreeSet<Integer>[] array = new TreeSet[n];

        for(int i = 0; i< n; i++)
            array[i] = new TreeSet<Integer>();

        for(int i =0; i< m; i++){
            int firstCord = input.nextInt();
            int secondCord = input.nextInt();
            array[firstCord-1].add(secondCord-1);
            array[secondCord-1].add(firstCord-1);
        }

        int source = input.nextInt();

        traverseBFS(source-1, array, distances, visited);
    }

    public static void traverseBFS(int source, TreeSet<Integer> [] array, int [] distances, boolean [] visited){
        LinkedList<Integer> queue = new LinkedList<Integer>();
        visited[source] = true;
        distances[source] = 0;
        int index;
        queue.add(source);

        Iterator iterator;

        while(!queue.isEmpty()){
            index = queue.getFirst();
            iterator = array[index].iterator();
            while (iterator.hasNext()){
                int num = (Integer)iterator.next();
                if(visited[num] == false){
                    distances[num] = distances[index] + edgeWeight;
                    visited[num] = true;
                    queue.add(num);
                }
            }
            queue.remove();
        }
        for(int i = 0 ; i < distances.length ; i++ ){
            if(i != source){
                if(distances[i] == Integer.MAX_VALUE)
                    System.out.print(-1 + " ");
                else
                    System.out.print(distances[i]  + " ");
            }
        }
    }
}