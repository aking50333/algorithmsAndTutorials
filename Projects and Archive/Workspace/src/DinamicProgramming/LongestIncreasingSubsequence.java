package DinamicProgramming;

import java.util.HashMap;

/**
 * Created by Ruben on 7/3/2015.
 */
public class LongestIncreasingSubsequence {

    public static void main(String[] args) {

        int [] array = {10, 22, 9, 33, 21, 50, 41, 60, 80};

        System.out.println(function(array));

    }

    public static int function(int [] array){

        int n = array.length;
        int [] larray = new int[n];
        int max;

        for(int i =0; i< n; i++){
            max = 1;
            for(int j =0; j< i ; j++){
                if(array[j] <= array[i] && max < 1 + larray[j])
                    max = 1 + larray[j];
            }
            larray[i] = max;
        }

        max = 0;
        for(int i =0; i < larray.length; i++)
            if(larray[i] > max)
                max = larray[i];
        return max;

    }
}
