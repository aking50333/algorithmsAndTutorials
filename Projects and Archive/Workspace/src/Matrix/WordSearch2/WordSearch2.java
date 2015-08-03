package Matrix.WordSearch2;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Created by Ruben on 6/23/2015.
 */
public class WordSearch2{
    public static void main(String[] args) {

        int[][] array = {{1,2,3,4},{7,8,9,10}, {13,14,15,16}, {19,20,21,22}};

        rotate(array);


    }

    public static void rotate(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n / 2; i++) {
            double k = Math.ceil(((double) n) / 2.);
            for (int j = 0; j <k ; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[n-1-j][i];
                matrix[n-1-j][i] = matrix[n-1-i][n-1-j];
                matrix[n-1-i][n-1-j] = matrix[j][n-1-i];
                matrix[j][n-1-i] = temp;
            }
        }
    }
}
