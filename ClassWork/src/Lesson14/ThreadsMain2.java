package Lesson14;

import Lesson14.core.MyThread;

public class ThreadsMain2 {
    public static void main(String[] args) {
        ThreadUtils.printThreadInfo();
        MyThread th1 = new MyThread();
        th1.start();
    }
}
