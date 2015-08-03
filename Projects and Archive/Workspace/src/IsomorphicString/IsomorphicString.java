package IsomorphicString;

import java.util.Vector;

/**
 * Created by Ruben on 6/16/2015.
 */
public class IsomorphicString {
    public static void main (String args []) {
        System.out.println(isIsomorphic("foo", "add"));

    }

    public static boolean isIsomorphic(String first, String second){

        if (first.length() != second.length())
            return false;

        char [] array = new char[256];
        for (int i =0; i < array.length; i++)
            array[i] = ' ';

        char [] firstString = first.toCharArray();
        char [] secondString = second.toCharArray();

        for (int i =0; i < firstString.length; i++){
            if (array[(byte)firstString[i]] == ' ')
                array[(byte)firstString[i]] = secondString[i];
            else
                if (array[(byte)firstString[i]] != secondString[i])
                    return false;
        }

        for (int i =0; i < array.length; i++)
            array[i] = ' ';

        for (int i =0; i < secondString.length; i++){
            if (array[(byte)secondString[i]] == ' ')
                array[(byte)secondString[i]] = firstString[i];
            else
            if (array[(byte)secondString[i]] != firstString[i])
                return false;
        }

        return true;
    }

}
