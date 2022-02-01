package Lesson14;

import Lesson14.core.InfinityWork;

public class ThreadsMain5 {
    public static void main(String[] args) {
        ThreadUtils.printThreadInfo();
        Runnable work = new InfinityWork();
        Thread th1 = new Thread(work);
        Thread th2 = new Thread(work);
        Thread th3 = new Thread(work);

        th1.start();
        th2.start();
        th3.start();

        th1.stop();
        th2.stop();
        th3.stop();
    }
}
