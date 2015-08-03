package Fib;

/**
 * Created by Ruben on 6/29/2015.
 */


public class FibNumber {

    public static void main(String args []){

        int k =4;
        System.out.println(calcFib(k));
    }

    public static int calcFib(int k){
        if (k < 1)
            return -1;
        if(k == 1)
            return 0;
        if(k == 2)
            return 1;
        int a = 0;
        int b = 1;
        int temp1;
        int temp2;

        for(int i =1; i < k; i++){
            temp1 = a;
            temp2 = b;
            b = temp1 + temp2;
            a = temp2;
        }
        return a;

    }

}
