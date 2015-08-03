package FunnyString;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for(int i =0; i<n; i++)
            System.out.println(isFunny(input.next()));
    }

    public static String isFunny(String str){
        char [] array = str.toCharArray();
        int n = array.length;
        for(int i = 0; i < n - 1 ; i ++){
            if(Math.abs(array[i] - array[i+1]) != Math.abs(array[n-i-1] - array[n-i-2])){
                return "Not Funny";
            }
        }
        return "Funny";

    }


}