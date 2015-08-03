package FactorialTrailingZeroes;

/**
 * Created by Ruben on 6/17/2015.
 */
public class FactorialTrailingZeroes {

    public static void main(String args[]){

        int n = 28;

        System.out.println(numberOfTrailingZeroes(n));
    }

    public static int numberOfTrailingZeroes(int number){
        int counter = 0;

        for(int i =5; number/i>=1; i*=5)
            counter += number/i;

        return counter;
    }
}
