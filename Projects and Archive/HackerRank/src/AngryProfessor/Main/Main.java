package AngryProfessor.Main;

import java.util.Scanner;

/**
 * Created by Ruben on 7/30/2015.
 */
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int n, k;

        for(int j =0 ; j < number; j++){
            int result = 0;
            n = input.nextInt();
            k = input.nextInt();
            int [] array = new int[n];
            for(int i =0; i< array.length; i++)
                array[i] = input.nextInt();

            for(int i=0; i < n; i++){
                if(array[i] <= 0)
                    result ++;
            }
            if(result < k)
                System.out.println("YES");
            else
                System.out.println("NO");

        }
    }
}
