package Lesson15.threads;

import Lesson15.threads.utils.ThreadUtils;


public class ThreadMain1 {
    public static void main(String[] args) {
        ThreadUtils.print();

        Thread thread = new ThreadExtend();
        thread.start();
    }
}
