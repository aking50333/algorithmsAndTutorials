package demoTutThree;

import java.util.Scanner;

class Processor extends Thread{

    private boolean running = true;
    @Override
    public void run() {
        while(running){
            System.out.println("Hello");
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void shutdown(){
        running = false;
    }
    public void turnON(){
        running = true;
    }
}

public class App{
    public static void main(String[] args) {
        Processor proc1 = new Processor();
        proc1.start();

        System.out.println("Press Enter to stop the thread");
        Scanner input  = new Scanner(System.in);
        String answer = input.nextLine();
        while (true){
            if (!answer.equals("stop"))
                proc1.turnON();
            else
                proc1.shutdown();
            answer = input.nextLine();

        }



    }

}
