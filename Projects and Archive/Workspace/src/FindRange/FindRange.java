package FindRange;

/**
 * Created by Ruben on 6/23/2015.
 */
public class FindRange {
    public static class Range{
        int start;
        int end;
        public Range(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }

    public static void main (String args []){
        int [] array = {5, 7, 7, 8, 8, 10, 12, 14};
        int value = 8;
        Range range = findRange(array, value);
    }

    public static Range findRange(int [] array, int value){

        int start = -1;
        int end = -1;

        start = findLeft(array, value);
        end = findRight(array, value);

        return new Range(start, end);
    }

    public static int findLeft(int [] array, int value){
        if(array.length==1 && array[0] != value){
            return -1;
        }else{
            if(value > array[array.length/2]){

//                return findLeft();

            }

        }
        return -1;
    }


    public static int findRight(int [] array, int value){
        if(array.length==1 && array[0] != value){
            return -1;
        }else{

        }
        return -1;
    }


}
