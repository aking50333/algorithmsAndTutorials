package PangramString;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(isPangram(input.nextLine()));
    }

    public static String isPangram(String str){
        int [] array = new int[26];
        char [] string = str.toCharArray();

        for(int i =0; i < string.length; i++){
            if((string[i] >= 97 && string[i] <= 122) || (string[i] >= 65 && string[i] <= 90))
                array[(string[i] - 65) % 32] ++;
        }

        for(int i = 0; i < 26; i++){
            if(array[i] == 0 )
                return "not pangram";
        }
        return "pangram";
    }


}