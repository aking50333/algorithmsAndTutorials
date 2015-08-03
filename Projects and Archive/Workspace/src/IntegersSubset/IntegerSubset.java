package IntegersSubset;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Ruben on 6/17/2015.
 */
public class IntegerSubset {

    public static void main(String args[]){

        int [] set = {1, 2, 3, 4, 5, 6};
        ArrayList<String> sets = intSubset(set);
        for (int i =0; i < sets.size(); i++)
            System.out.println(sets.get(i));
    }

    public static ArrayList<String> intSubset(int [] set){
        ArrayList<String> sets = new ArrayList<String>();
        sets.add("[ ]");
        for(int size =1; size < set.length; size ++){
            for (int i = 0 ; i < set.length-size+1; i ++){
                String str = "";
                for(int j = i; j < i + size; j ++)
                    str = str + set[j] + " ";
                sets.add(new String("[" + str + "]"));
            }
        }

        return sets;
    }
}
