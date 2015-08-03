package AMPM;

import java.util.Scanner;

/**
 * Created by Ruben on 7/30/2015.
 */
public class Main {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        String temp = str.substring(0, 2);

        if(str.charAt(str.length()-2) == 'P' && !str.substring(0, 2).equals("12")){
            int num = Integer.parseInt(temp);

            num = (num +12) % 24;
            temp = String.valueOf(num);
        }
        else if(str.charAt(str.length()-2) == 'A' && str.substring(0, 2).equals("12")) {
            temp = "00";
        }

        str = temp + str.substring(2, str.length());
        str = str.substring(0, str.length()-2);
        System.out.println(str);
    }
}
