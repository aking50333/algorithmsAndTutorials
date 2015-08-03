package PowerOfTheNumber;

/**
 * Created by Ruben on 6/17/2015.
 */
public class MathPow {

    public static void main(String[] args) {

        int number = 2;
        int power = 10;

        System.out.println(mathPow(number, power));
        System.out.println(mathPower(number, power));
    }

    public static int mathPow(int number, int pow){
        int result = 1;
        if (number == 0)
            return 0;
        for (int i =0; i < pow; i++)
            result = result* number;
        return result;
    }

    public static int mathPower(int number, int power){
        if(power == 0)
             return 1;
        if(power % 2 ==1)
            return mathPower(number, power/2) * mathPower(number, power/2) * number;
        else
            return mathPower(number, power/2) * mathPower(number, power/2);
    }
}
