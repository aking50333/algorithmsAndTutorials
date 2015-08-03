package PalindromeNumbers;

/**
 * Created by Ruben on 6/17/2015.
 */
public class PalindromeNumber {
    public static void main(String args[]){
        int number = 2332;
        System.out.println(isPalindrome(number));
    }

    public static boolean isPalindrome(int number){
        if (number == reverseInteger(number))
            return true;
        return false;
    }

    public static int reverseInteger(int number){
        int result = 0;
        if (number == 0)
            return 0;

        if (number < 0){
            number = 0 - number;
            while(number % 10 != 0){
                result = 10 * result + number % 10;
                number = number /10;
            }
            result = 0 - result;
        }else{
            while(number % 10 != 0){
                result = 10 * result + number % 10;
                number = number /10;
            }
        }
        return result;
    }

}
