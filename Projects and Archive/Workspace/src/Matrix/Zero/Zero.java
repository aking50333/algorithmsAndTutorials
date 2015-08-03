package Matrix.Zero;

/**
 * Created by Ruben on 6/26/2015.
 */
public class Zero {
    public static void main(String args[]){
        int [][] array = new int[5][6];
        for(int i =0; i< array.length; i++){
            for (int j =0; j< array[0].length; j++){
                array[i][j] = 1;
            }
        }

        array[1][0] = 0;
        array[1][2] = 0;
        array[3][4] = 0;

        for(int i =0; i< array.length; i++){
            for (int j =0; j< array[0].length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }


        System.out.println("////////////////////\n" +
                "////////////////////");
        setZeroes(array);

        for(int i =0; i< array.length; i++){
            for (int j =0; j< array[0].length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void setZeroes(int [][] array){

        int [] row = new int[array.length];
        int [] column = new int[array[0].length];

        for(int i =0; i< array.length; i++){
            for (int j =0; j< array[0].length; j++){
                if (array[i][j] == 0){
                    row[i] = 1;
                    column[j] = 1;
                }
            }
        }

        for (int i =0; i< row.length; i++){
            if(row[i] == 1){
                for(int j =0; j < array[0].length; j++)
                    array[i][j] = 0;
            }
        }

        for (int i =0; i< column.length; i++){
            if(column[i] == 1){
                for(int j =0; j < array.length; j++)
                    array[j][i] = 0;
            }
        }
    }

}
