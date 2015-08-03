package HappyNumber;

import java.util.TreeSet;

/**
 * Created by Ruben on 6/17/2015.
 */
public class HappyNumber {

    public static void main (String args[]){
        int number = 970;
        System.out.println(isHappyNumber(number));

    }

    public static TreeSet set = new TreeSet<Integer>();

    public static boolean isHappyNumber(int number){
        String str = Integer.toString(number);
        int result =0;
        int size = str.length();
        String [] array = new String[size];

        for (int i =0; i < size; i++){
            array[i] = String.valueOf(str.charAt(i));
            result += Math.pow(Integer.parseInt(array[i]), 2);
        }

        if (result == 1)
            return true;
        else{
            if (set.contains(result))
                return false;
            else{
                set.add(result);
                return isHappyNumber(result);
            }
        }

    }



}
