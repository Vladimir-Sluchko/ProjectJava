package Lesson14;

import java.util.concurrent.TimeUnit;

public class ThreadMain10_2 {
    static int a = 0;
    static Object lock = new Object();

    public static void main(String[] args) throws InterruptedException {
        TimeUnit.SECONDS.sleep(10);
        Thread thread = new Thread(() -> {
            synchronized (lock){
                for (int i = 0; i < 100_000; i++) {
                    lock.notify();
                    try {
                        lock.wait();
                        //TimeUnit.NANOSECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    a = a + 1;
                    System.err.println("+1");
                    lock.notify();
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            synchronized (lock){
                for (int i = 0; i < 100_000; i++) {
                    lock.notify();
                    try {
                        lock.wait();
                        //TimeUnit.NANOSECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    a = a - 1;
                    System.err.println("-1");
                    lock.notify();
                }
            }
        });

        thread.start();
        thread2.start();
        try {
            thread.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.err.println(a);

    }
}
