package ShortestPalindrome;

/**
 * Created by Ruben on 6/22/2015.
 */
public class ShortestPalindrome {

    public static void main(String[] args) {
        String str = "acab";

        System.out.println(shortestPal(str));
    }

    public static String shortestPal(String str){

        int i =0;
        while (i < str.length()){
            if (isPalindrome(str.substring(0, str.length()-i))){
                break;
            }
            i++;
        }


        String result = str.substring(0, str.length()-i);

        char [] array = str.substring(str.length()-i, str.length()).toCharArray();

        for (int j =0; j < array.length; j++)
            result = array[j] + result + array[j];


        System.out.println(result);

        return result;
    }

    public static boolean isPalindrome(String str){
        char [] array = str.toCharArray();

        for (int i =0; i< str.length()/2; i++){
            if(array[i] != array[str.length()-1-i])
                return false;
        }

        return true;

    }

}
