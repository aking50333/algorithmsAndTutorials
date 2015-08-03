package ArrayRotate;

/**
 * Created by Ruben on 6/16/2015.
 */
public class RotateArray {

    public static void main(String args []){

        int [] array = {1,2,3,4,5,6,7,8,9,10};
        int k = 3;
        array = rotateArray(array, k);

        for (int i =0; i<array.length; i++)
            System.out.println(array[i]);
    }

    public static int[] rotateArray(int [] array, int k){

        k = k % array.length;

        int [] newArray = new int [array.length];

        for (int i = 0; i<array.length; i++)
            newArray[(i+k-1)%array.length] = array[i];

        return newArray;

    }

}
