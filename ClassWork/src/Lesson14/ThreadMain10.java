package Lesson14;

public class ThreadMain10 {
    static int a = 0;
    static Object lock = new Object();

    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 100_000; i++) {
                synchronized (lock){
                    a = a + 1;
                    System.err.println("+1");
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 100_000; i++) {
                synchronized (lock){
                    a = a - 1;
                    System.err.println("-1");
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
