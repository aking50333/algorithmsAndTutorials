package Cesar;

import java.util.Scanner;
/**
 * Created by Ruben on 7/30/2015.
 */
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        String str = input.next();
        int rot = input.nextInt();
        System.out.println(encript(num, str, rot));
    }

    public static String encript(int num, String str, int rot){

        char[] array = str.toCharArray();
        String result = "";

        for(int i = 0; i < num; i++){
            if((byte)array[i] >= 97 && (byte)array[i] <=122 ){
                result += (char)((array[i] % 97 + rot)% 97 + 97);
            }else if((byte)array[i] >= 65 && (byte)array[i] <=90 ){
                result += (char)((array[i] % 65 + rot)% 65 + 65);
            }else {
                result += array[i];
            }
        }
        return result;
    }

}
