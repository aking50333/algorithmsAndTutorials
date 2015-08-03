package MedianOfTwoSortedArrays;

import java.util.PriorityQueue;

/**
 * Created by Ruben on 6/17/2015.
 */
public class MedianOfTwoSortedArrays {

    public static void main(String args[]){
        int [] arrayA = {1,3,5,7,9};
        int [] arrayB = {2,4,6,8};

        System.out.println(medianOfArrays(arrayA, arrayB));
    }


    public static int medianOfArrays(int [] arrayA, int [] arrayB) {
        int [] supportArray = new int[arrayA.length + arrayB.length];

        int i =0;
        int j =0;
        int counter = 0;
        while(hasNext(arrayA, i) && hasNext(arrayB, j)){
            if (arrayA[i] < arrayB[j]){
                supportArray[counter] = arrayA[i];
                counter ++;
                i++;
            }else{
                supportArray[counter] = arrayB[j];
                counter ++;
                j++;
            }
        }

        if (i < arrayA.length){
            while(hasNext(arrayA, i)){
                supportArray[counter] = arrayA[i];
                counter ++;
                i++;
            }
        }

        if (j < arrayB.length){
            while(hasNext(arrayB, j)){
                supportArray[counter] = arrayB[j];
                counter ++;
                j++;
            }
        }
        return supportArray[supportArray.length/2];
    }
//    public static int medianOfArrays(int [] arrayA, int [] arrayB){
//        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
//        for (int i = 0; i< arrayA.length; i++)
//            queue.add(arrayA[i]);
//
//        for (int i = 0; i< arrayB.length; i++)
//            queue.add(arrayB[i]);
//
//        for (int i =0; i < (arrayA.length + arrayB.length)/2; i++)
//            queue.poll();
//
//        return queue.peek();
//    }

    public static boolean hasNext(int [] array, int index){
        if (index < array.length - 1)
            return true;
        return false;
    }
}
