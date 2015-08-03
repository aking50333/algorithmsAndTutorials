package PosDif;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double n = input.nextDouble();
        int [] array = new int[(int)n];

        for(int i =0; i< array.length; i++)
            array[i] = input.nextInt();

        double pos = 0;
        double zero = 0;
        double neg = 0;

        for(int i =0; i < n; i++){
            if(array[i] > 0)
                pos ++;
            else if(array[i] < 0)
                neg ++;
            else
                zero ++;
        }

        double posDif = pos/n;
        double negDif = neg/n;
        double zeroDif = zero/n;

        System.out.print(String.format("%.3g%n", posDif));
        System.out.print(String.format("%.3g%n", negDif));
        System.out.print(String.format("%.3g%n", zeroDif));
    }
}