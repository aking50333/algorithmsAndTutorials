package ArrayDiagonals;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int [][] array = new int[n][n];
        for(int i =0; i < n; i++){
            for(int j =0; j < n; j++){
                array[i][j] = input.nextInt();
            }
        }

        int sumFirst = 0;
        int sumSecond = 0;

        for(int i =0; i < n; i++)
            sumFirst += array[i][i];
        for(int i =0; i < n; i++)
            sumSecond += array[i][n-1-i];

        System.out.println(Math.abs(sumFirst - sumSecond));

    }
}
