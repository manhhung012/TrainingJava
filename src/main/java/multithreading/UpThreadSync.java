package multithreading;

public class UpThreadSync extends Thread{
    @Override
    public void run(){
        Funtions ft = new Funtions();
        ft.UpSync();
    }
}
