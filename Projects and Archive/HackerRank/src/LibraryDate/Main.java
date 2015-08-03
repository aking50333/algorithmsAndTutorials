package LibraryDate;

import java.util.Scanner;
/**
 * Created by Ruben on 7/30/2015.
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] retDate = new int[3];
        int [] expDate = new int[3];
        for(int i =0; i< 3; i++)
            retDate[i] = input.nextInt();
        for(int i =0; i< 3; i++)
            expDate[i] = input.nextInt();

        System.out.println(checkFine(retDate, expDate));


    }

    public static int checkFine(int [] retDate, int [] expDate){
        if(retDate[2] > expDate[2])
            return 10000;
        if(retDate[2] < expDate[2])
            return 0;

        if(retDate[1] > expDate[1])
            return 500 * (retDate[1] - expDate[1]);
        if(retDate[1] < expDate[1])
            return 0;

        if(retDate[0] > expDate[0])
            return 15 * (retDate[0] - expDate[0]);
        else
            return 0;
    }
}
