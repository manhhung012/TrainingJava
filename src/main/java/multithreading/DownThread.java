package multithreading;

public class DownThread extends Thread {
    @Override
    public void run() {
        Funtions ft = new Funtions();
        ft.Down();
    }
}