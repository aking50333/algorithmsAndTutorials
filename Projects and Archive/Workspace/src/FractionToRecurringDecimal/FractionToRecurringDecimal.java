package FractionToRecurringDecimal;

/**
 * Created by Ruben on 6/17/2015.
 */
public class FractionToRecurringDecimal {

    public static void main (String args[]){

        int numerator = 2;
        int denominator = 3;

        System.out.println(fractionToDecimal(numerator, denominator));
    }

    public static String fractionToDecimal(int numerator, int denominator){

        int left = numerator / denominator;
        int right = numerator * 10000 / denominator - numerator/denominator * 10000;
        while (right % 10 == 0 && right  > 0)
            right = right/10;

        if (right == 0)
            return left + "";


        return left + "." + right;


    }


}
