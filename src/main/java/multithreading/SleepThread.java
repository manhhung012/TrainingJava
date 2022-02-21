package multithreading;

public class SleepThread extends Thread{
    @Override
    public void run(){
        Funtions.Sleep(5);
    }
}
