package multithreading;

public class UpThread extends Thread {
    @Override
    public void run() {
        Funtions ft = new Funtions();
        ft.Up();
    }
}
