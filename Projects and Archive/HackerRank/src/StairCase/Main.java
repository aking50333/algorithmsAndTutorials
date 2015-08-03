package StairCase;

import java.util.Scanner;

/**
 * Created by Ruben on 7/30/2015.
 */
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        String str = "";

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1 - i; j++)
                str += " ";
            for (int j = 0; j < i+1; j++)
                str += "#";

            System.out.println(str);
            str = "";
        }

    }
}
