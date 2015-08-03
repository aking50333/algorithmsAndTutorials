package demoTutTwo;

class Runner implements Runnable{
    @Override
    public void run() {
        for (int i =0; i< 1000; i++){
            System.out.println(" " + i);
        }
    }
}

public class testTwo {
        public static void main(String[] args) {
        Thread t1 = new Thread(new Runner());
        Thread t2 = new Thread(new Runner());
            t1.start();
            t2.start();
    }

}
