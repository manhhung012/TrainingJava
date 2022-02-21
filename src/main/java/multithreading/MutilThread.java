package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MutilThread {

    public static void main(String[] args) throws InterruptedException {
        UpThread upThread = new UpThread();
        DownThread downThread = new DownThread();

        //start()
        upThread.start();
        downThread.start();
    }
}

class MutilThreadJoin {

    public static void main(String[] args) throws InterruptedException {
        UpThread upThread = new UpThread();
        DownThread downThread = new DownThread();

        upThread.setName("upThread");
        downThread.setName("downThread");

        //Join()
        System.out.println(upThread.getName() + ": " + upThread.getId() + " - Running");
        upThread.start();
        upThread.join();
        System.out.println("\n" + downThread.getName() + ": " + downThread.getId() + " - Running");
        downThread.start();
    }
}

class MutilThreadSync {

    public static void main(String[] args) throws InterruptedException {
        UpThreadSync upThreadSync1 = new UpThreadSync();
        UpThreadSync upThreadSync2 = new UpThreadSync();

        //Sync
        upThreadSync1.start();
        upThreadSync2.start();
    }
}

class MutilThreadSleep {

    public static void main(String[] args) throws InterruptedException {
        SleepThread sl = new SleepThread();

        //Sleep
        sl.start();
    }
}

class MutilThreadPool {

    public static void main(String[] args) throws InterruptedException {
        ExecutorService excutor = Executors.newFixedThreadPool(4);

        for (int i = 0; i < 10; i++) {
            SleepThread sltp = new SleepThread();
            excutor.execute(sltp);
        }
        excutor.shutdown();
        System.out.println("Finish");
    }
}

class MutilThreadGroup {

    public static void main(String[] args) throws InterruptedException {
        TestThreadGroup ttgRunnable = new TestThreadGroup();
        ThreadGroup tg = new ThreadGroup("ThreadGroup Test");

        Thread t1 = new Thread(tg, ttgRunnable, "t1");
        Thread t2 = new Thread(tg, ttgRunnable, "t2");
        Thread t3 = new Thread(tg, ttgRunnable, "t3");
        t1.start();
        t2.start();
        t3.start();

        System.out.println(tg.activeCount());
        System.out.println(tg.toString());
        System.out.println(tg.getName());
        tg.list();
    }
}
