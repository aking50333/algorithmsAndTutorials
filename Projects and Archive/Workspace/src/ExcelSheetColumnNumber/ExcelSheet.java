package ExcelSheetColumnNumber;

/**
 * Created by Ruben on 6/17/2015.
 */
public class ExcelSheet {

    public static void main(String args[]){


        String str = "AB";

        System.out.println((int)returnNumber(str));

    }

    public static double returnNumber(String str){
        int index;
        double result = 0;
        char [] characters = str.toCharArray();

        for (int i = characters.length-1; i >= 0; i--){
            index = (int)characters[characters.length-1 -i]-64;
            result = result + Math.pow(26, i) * index;
        }
        return result;
    }

}
