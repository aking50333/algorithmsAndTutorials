package MergeIntervals;

import java.util.ArrayList;

/**
 * Created by Ruben on 6/17/2015.
 */
public class MergeIntervals {
    public static void main(String args[]) {
        Intervals interval1 = new Intervals(1, 3);
        Intervals interval2 = new Intervals(2, 6);
        Intervals interval3 = new Intervals(8, 10);
        Intervals interval4 = new Intervals(14, 16);

        ArrayList<Intervals> intervals = new ArrayList<Intervals>();
        intervals.add(interval1);
        intervals.add(interval2);
        intervals.add(interval3);
        intervals.add(interval4);

        mergeIntervals(intervals);
    }


    public static ArrayList<Intervals> mergeIntervals(ArrayList<Intervals> intervals){

        ArrayList<Intervals> newArrayList = new ArrayList<Intervals>();

        for (int i =0; i < intervals.size()-1; i++){
            for (int j = 0; j< intervals.size(); j++){
                merge2Intervals(intervals.get(i), intervals.get(j));
            }
        }

        return newArrayList;
    }

    public static Intervals merge2Intervals(Intervals interval1, Intervals interval2){
//      if (intervals.get(i).getStart() > intervals.get(j).getEnd() || intervals.get(j).getStart() > intervals.get(i).getEnd())

        if (interval1.getStart() < interval2.getStart()){
            if (interval1.getEnd() > interval2.getEnd())
                return new Intervals(interval1.getStart(), interval1.getEnd());
            else
                return new Intervals(interval1.getStart(), interval2.getEnd());
        }else{
            if (interval1.getEnd() > interval2.getEnd())
                return new Intervals(interval2.getStart(), interval1.getEnd());
            else
                return new Intervals(interval2.getStart(), interval2.getEnd());
        }

    }


    public static class Intervals{
        private int start;
        private int end;

        public Intervals(int start, int end) {
            this.start = start;
            this.end = end;
        }

        public int getStart() {
            return start;
        }

        public void setStart(int start) {
            this.start = start;
        }

        public int getEnd() {
            return end;
        }

        public void setEnd(int end) {
            this.end = end;
        }
    }

}
