package multithreading;

public class Funtions {
    public void Down(){
        for (int i = 9; i >= 0; i--) {
            System.out.print(i+"\t");
        }
    }

    public void Up() {
        for (int i = 0; i < 10; i++) {
            System.out.print(i+"\t");
        }
    }

    public synchronized void UpSync(){
        for (int i = 0; i < 10; i=i+2) {
            System.out.print(i+"\t");
        }
    }

    public static void Sleep(int n){
        for (int i = 0; i < n; i++) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.print(i+"\t");
        }
    }
}