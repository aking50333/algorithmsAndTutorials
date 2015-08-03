package CountPrimes;

import java.util.ArrayList;

/**
 * Created by Ruben on 6/17/2015.
 */
public class CountPrimes {
    public static void main(String args[]){
        int number = 2;

        System.out.println(numberOfPrime(number));
    }

    public static int numberOfPrime(int number){

        if (number < 2)
            return 0;

        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i =2; i < number; i++)
            list.add(i);

        for (int i =2; i < list.size(); i++){
            for (int j = 2; i*j <= number; j++)
                list.remove(Integer.valueOf(i * j));
        }

        return list.size() + 1;

    }

}
