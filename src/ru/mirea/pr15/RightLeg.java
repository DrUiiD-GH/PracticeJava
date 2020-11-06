package ru.mirea.pr15;

public class RightLeg extends Thread {
    public void run(){
        for(int i=0; i<10; i++){
            System.out.println("RIGHT");
            try{
                Thread.sleep(400);
            }
            catch(InterruptedException e){
                System.out.println("Thread has been interrupted");
            }
        }
    }
}
