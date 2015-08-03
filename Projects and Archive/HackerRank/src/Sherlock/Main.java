package Sherlock;

import java.util.Scanner;

/**
 * Created by Ruben on 7/30/2015.
 */
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int [] array = new int[number];
        for(int i =0; i < number; i++)
            array[i] = input.nextInt();
        for(int j =0; j < number; j ++){
            int a =0;
            int b =0;
            boolean status = false;
            for (int i = 0; i <= array[j]; i++){
                a = array[j]-i;
                b = i;
                if(a % 3 == 0 && b % 5 == 0){
                    status = true;
                    break;
                }
            }
            if(status){
                String str = "";
                for(int i =0; i < a; i++)
                    str += "5";
                for(int i =0; i < b; i++)
                    str += "3";
                System.out.println(str);
            }else{
                System.out.println("-1");
            }
        }
    }
}
