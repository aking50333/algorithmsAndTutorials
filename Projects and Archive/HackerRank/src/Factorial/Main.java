package Factorial;

import java.math.BigInteger;
import java.util.Scanner;
/**
 * Created by Ruben on 7/30/2015.
 */
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(fact(BigInteger.valueOf(n)));
    }

    public static BigInteger fact(BigInteger n){
        BigInteger result = BigInteger.ONE;

        while (!n.equals(BigInteger.ZERO)) {
            result = result.multiply(n);
            n = n.subtract(BigInteger.ONE);
        }

        return result;
    }
}
