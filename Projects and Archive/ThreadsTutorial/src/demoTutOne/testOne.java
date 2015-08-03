package demoTutOne;

/**
 * Created by Ruben on 7/23/2015.
 */
public class testOne {

    public static class Runner extends Thread{

        private String name;

        public Runner (String name){
            this.name = name;
        }

        @Override
        public void run() {
            for (int i =0; i< 1000; i++){
                System.out.println(name + " " + i);
            }
        }
    }

    public static void main(String[] args) {
        Runner r1 = new Runner("Rabbit");
        Runner r2 = new Runner("Horse");
        r1.start();
        r2.start();

    }
}
