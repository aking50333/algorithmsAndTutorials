package KthLargestElement;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * Created by Ruben on 6/17/2015.
 */
public class KthLargersElemenet {
    public static void main (String args[]){
        int  [] array = {2,3,7,4,1,5,6};

        int k =2;
        System.out.println(largestKth1(array, k));
        System.out.println(largestKth2(array, k));
    }


    public static int largestKth1(int [] array, int k){
        Arrays.sort(array);
        return array[array.length - k];
    }

    public static int largestKth2(int [] array, int k){
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
        for (int i = 0; i < array.length; i ++ )
            queue.add(array[i]);

        for (int i =0; i< array.length - k; i++)
            queue.poll();
        return queue.peek();
    }


}
